package top.duanhong.steward.service.file.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.entity.po.StewFile;
import top.duanhong.steward.enumeration.SequenceEnum;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.mapper.gmapper.StewFileMapper;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.service.sys.impl.RedisSequenceService;
import top.duanhong.steward.service.file.QiNiuFileService;
import top.duanhong.steward.utils.QiNiuUtil;

import javax.annotation.Resource;
import java.io.File;

@Service
public class QiNiuFileServiceImpl implements QiNiuFileService {

    @Autowired
    private RedisSequenceService redisSequenceService;

    @Autowired
    private ObjectMapper objectMapper;

    @Resource
    private StewFileMapper stewFileMapper;

    @Override
    public MethodExecuteResult uploadQiNiuFile(File file) {
        MethodExecuteResult result = new MethodExecuteResult(StatusCodeEnum.SUCCESS_CODE.getMessage(), true, StatusCodeEnum.SUCCESS_CODE.getCode());
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.region0());
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String upToken = QiNiuUtil.getUploadToken();
        if (file != null) {
            try {
                String fileKey = redisSequenceService.generateWithPrefix(SequenceEnum.QI_NIU_FILE_SEQ);
                Response response = uploadManager.put(file, fileKey, upToken);
                //解析上传成功的结果
                DefaultPutRet putRet = objectMapper.readValue(response.bodyString(), DefaultPutRet.class);
                //System.out.println(putRet.key);
                //System.out.println(putRet.hash);

                //保存文件属性（文件存在七牛云）
                StewFile stewFile=new StewFile();
                stewFile.setFileId(redisSequenceService.generateWithPrefix(SequenceEnum.STEW_FILE_SEQ));
                stewFileMapper.insert(stewFile);
                result.setData(putRet);
            } catch (QiniuException e) {
                result.setSuccess(false);
                result.setResultCode("8979");
                result.setMessage("文件上传异常");
                e.printStackTrace();
            } catch (JsonMappingException e) {
                result.setSuccess(false);
                result.setResultCode("8797");
                result.setMessage("上传结果集转换异常");
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                result.setSuccess(false);
                result.setResultCode("8797");
                result.setMessage("上传结果集转换异常");
                e.printStackTrace();
            }
        }
        return result;
    }
}
