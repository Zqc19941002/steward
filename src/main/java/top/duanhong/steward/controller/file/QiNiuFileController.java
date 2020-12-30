package top.duanhong.steward.controller.file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.service.qiniu.QINiuFileService;

import java.io.File;

@RestController
@RequestMapping("/qiniu")
public class QiNiuFileController {

    @Autowired
    private QINiuFileService qiNiuFileService;

    @PostMapping("/upload")
    public BaseResponse uploadQiNiuFile(){
        MethodExecuteResult result=qiNiuFileService.uploadQiNiuFile(new File("E:\\资料\\简历\\简历-北京.pdf"));
        return null;
    }


}
