package top.duanhong.steward.controller.file;

import com.qiniu.storage.model.DefaultPutRet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.service.file.QiNiuFileService;
import top.duanhong.steward.utils.QiNiuUtil;
import top.duanhong.steward.utils.ResponseUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/qiniu")
public class QiNiuFileController {

    @Autowired
    private QiNiuFileService qiNiuFileService;

    @PostMapping("/upload")
    public SysBaseResponse uploadQiNiuFile(HttpServletRequest request) {
        SysBaseResponse sysBaseResponse = ResponseUtil.getSuccessRes(null);
        //保存头像-上传至私有七牛云
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        List<MultipartFile> files = multipartRequest.getFiles("file");
        File file = null;
        if (files.size() > 0) {
            MultipartFile multipartFile = files.get(0);
            String fileName = multipartFile.getOriginalFilename();
            String prefix = fileName.substring(fileName.indexOf("."));
            try {
                file = File.createTempFile(System.currentTimeMillis() + "", prefix);
                multipartFile.transferTo(file);
            } catch (IOException e) {
                sysBaseResponse.setErrorCode("535445");
                sysBaseResponse.setErrorMessage("文件转换异常");
                e.printStackTrace();
                return sysBaseResponse;
            }
        } else {
            sysBaseResponse.setErrorCode("235433");
            sysBaseResponse.setErrorMessage("文件获取异常");
            return sysBaseResponse;
        }
        if (file != null) {
            MethodExecuteResult<DefaultPutRet> uploadResult = qiNiuFileService.uploadQiNiuFile(file);
            if (uploadResult.isSuccess()) {
                DefaultPutRet defaultPutRet = uploadResult.getData();
                String imageUrl=QiNiuUtil.getDownloadUrl(defaultPutRet.key,true);
                String imageKey=defaultPutRet.key;
                Map uploadImageMap=new HashMap();
                uploadImageMap.put("fileUrl",imageUrl);
                uploadImageMap.put("fileKey",imageKey);
                sysBaseResponse.setBody(uploadImageMap);
            }
        }
        return sysBaseResponse;
    }


}
