package top.duanhong.steward.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.duanhong.steward.entity.po.StewFile;
import top.duanhong.steward.entity.po.StewFileExample;
import top.duanhong.steward.entity.vo.FileTreeVo;
import top.duanhong.steward.mapper.gmapper.StewFileMapper;
import top.duanhong.steward.request.FileAddReq;
import top.duanhong.steward.request.FileSelectReq;
import top.duanhong.steward.request.RenameFileReq;
import top.duanhong.steward.service.sys.impl.RedisSequenceService;
import top.duanhong.steward.utils.TreeDataUtils;
import top.duanhong.steward.utils.MethodExcuResult;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author duanhong
 * @description
 * @date 2019/8/24
 */
@Service
public class FileService {
    @Autowired
    RedisSequenceService redisSequenceService;

    @Autowired
    private FileTypeService fileTypeService;

    @Resource
    private StewFileMapper stewFileMapper;

    /**
     * 新增文件或者文件夹
     * @param fileAddReq
     * @return
     */
    public MethodExcuResult saveFileOrFolder(FileAddReq fileAddReq) {
        //新增判重
        StewFileExample stewFileExample=new StewFileExample();
        StewFileExample.Criteria criteria=stewFileExample.createCriteria();
        if (!StringUtils.isBlank(fileAddReq.getFileTypeId())){
            criteria.andFileTypeIdEqualTo(fileAddReq.getFileTypeId());
        }
        if (!StringUtils.isBlank(fileAddReq.getUserId())){
            criteria.andUserIdEqualTo(fileAddReq.getUserId());
        }
        if (!StringUtils.isBlank(fileAddReq.getParentId())){
            criteria.andParentIdEqualTo(fileAddReq.getParentId());
        }
        List<StewFile> list=stewFileMapper.selectByExample(stewFileExample);
        if (list!=null){
            for (StewFile file:list
            ) {
                if (fileAddReq.getName().equals(file.getName())){
                    return MethodExcuResult.builder().isSuccess(false).code("666666").mess("文件名重复").build();
                }
            }
        }else {
            return MethodExcuResult.builder().isSuccess(false).code("42654").mess("文件列表查询失败").build();
        }
        //没有重名就新增
        StewFile stewFile=new StewFile();
        stewFile.setName(fileAddReq.getName());
        stewFile.setType(fileAddReq.getType());
        stewFile.setFileTypeId(fileAddReq.getFileTypeId());
        stewFile.setRemark(fileAddReq.getRemark());
        stewFile.setParentId(fileAddReq.getParentId());
        stewFile.setContent(fileAddReq.getContent());
        stewFile.setCreateTime(new Date());
        stewFile.setUpdateTime(new Date());
        stewFile.setStatus("1");
        if (StringUtils.isBlank(fileAddReq.getParentId())){
            stewFile.setParentId("0");
        }
        //获取登录者信息，设置userId
        stewFile.setUserId(fileAddReq.getUserId());
        stewFile.setFileId(redisSequenceService.generateWithPrefix("STEW_FILE_SEQ"));
        int result = stewFileMapper.insert(stewFile);
        if (result > 0) {
            return MethodExcuResult.builder()
                    .isSuccess(true)
                    .result(result)
                    .build();
        } else {
            return MethodExcuResult.builder()
                    .isSuccess(false)
                    .mess("新增文件失败")
                    .build();
        }
    }

    /**
     * 获取文件列表
     * @param req
     * @return
     */
    public MethodExcuResult getAllFileListByType(FileSelectReq req) {
        MethodExcuResult methodExcuResult=MethodExcuResult.builder().isSuccess(true).build();
        StewFileExample stewFileExample=new StewFileExample();
        StewFileExample.Criteria criteria=stewFileExample.createCriteria();
        if (!StringUtils.isBlank(req.getFileTypeId())){
            criteria.andFileTypeIdEqualTo(req.getFileTypeId());
        }
        if (!StringUtils.isBlank(req.getUserId())){
            criteria.andUserIdEqualTo(req.getUserId());
        }
        List<StewFile> list=stewFileMapper.selectByExample(stewFileExample);
        if (list!=null){
            List<FileTreeVo> fileTree= TreeDataUtils.getFileTree(list);
            methodExcuResult.setResult(fileTree);
        }else {
            methodExcuResult.setSuccess(false);
        }
        return methodExcuResult;
    }

    /**
     * 文件重命名
     * @param renameFileReq
     * @return
     */
    public MethodExcuResult renameFile(RenameFileReq renameFileReq) {
        MethodExcuResult methodExcuResult=MethodExcuResult.builder().isSuccess(true).build();
        StewFile stewFile=new StewFile();
        if (!StringUtils.isBlank(renameFileReq.getFileId())){
            stewFile.setFileId(renameFileReq.getFileId());
        }
        if (!StringUtils.isBlank(renameFileReq.getName())){
            stewFile.setName(renameFileReq.getName());
        }
        int result=stewFileMapper.updateByPrimaryKeySelective(stewFile);
        if (result==1){
            methodExcuResult.setResult(result);
        }else {
            methodExcuResult.setSuccess(false);
        }
        return methodExcuResult;
    }
}
