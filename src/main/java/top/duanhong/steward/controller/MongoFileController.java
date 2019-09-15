package top.duanhong.steward.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.duanhong.steward.entity.bo.FileDocument;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.service.MongoFileService;
import top.duanhong.steward.utils.ResponseUtil;

import java.util.List;
import java.util.Optional;

/**
 * @author duanhong
 * @description mongo文件服务接口
 * @date 2019/8/20
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("files")
public class MongoFileController {
    @Autowired
    private MongoFileService fileService;

    /**
     * 上传文件列表
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @RequestMapping("/list")
    public List<FileDocument> list(int pageIndex, int pageSize){
        return fileService.listFilesByPage(pageIndex,pageSize);
    }

    

    /**
     * 在线显示文件
     * @param id 文件id
     * @return
     */
    @GetMapping("/queryFileById")
    public BaseResponse serveFileOnline(@PathVariable String id) {
        Optional<FileDocument> file = fileService.getById(id);
        if (file.isPresent()) {
            return BaseResponse.builder()
                    .errorCode(StatusCodeEnum.SUCCESS_CODE.getCode())
                    .errorMessage(StatusCodeEnum.SUCCESS_CODE.getCode())
                    .body(file.get().getContent())
                    .build();
//            return ResponseEntity.ok()
//                    .header(HttpHeaders.CONTENT_DISPOSITION, "fileName=" + file.get().getName())
//                    .header(HttpHeaders.CONTENT_TYPE, file.get().getContentType())
//                    .header(HttpHeaders.CONTENT_LENGTH, file.get().getSize() + "").header("Connection", "close")
//                    .body(file.get().getContent());
        } else {
            return ResponseUtil.getFailedRes("00005","文件获取异常");
        }
    }

}
