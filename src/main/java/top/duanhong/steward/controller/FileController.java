package top.duanhong.steward.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.request.*;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.service.FileService;
import top.duanhong.steward.service.FileTypeService;
import top.duanhong.steward.service.RedisSequenceService;
import top.duanhong.steward.utils.MethodExcuResult;
import top.duanhong.steward.utils.ResponseUtil;

import javax.validation.Valid;

/**
 * @author duanhong
 * @description 文件接口
 * @date 2019/8/24
 */
@RestController
@Slf4j
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @Autowired
    private FileTypeService fileTypeService;

    @Autowired
    private RedisSequenceService redisSequenceService;

    @GetMapping("/fileAllList")
    public BaseResponse getAllFileList(String fileTypeId){
        if (StringUtils.isBlank(fileTypeId)){
            return ResponseUtil.getFailedRes("23242","类型编码不能为空");
        }
        //根据类型id和用户id查询
        FileSelectReq req=new FileSelectReq();
        req.setFileTypeId(fileTypeId);
        req.setUserId("duanhong");
        MethodExcuResult result=fileService.getAllFileListByType(req);
        if(result.isSuccess()){
            return ResponseUtil.getSuccessRes(result.getResult());
        }else {
            return ResponseUtil.getFailedRes("9y8678","文件获取失败");
        }
    }

    @PostMapping("/saveFile")
    public BaseResponse saveFileOrFolder(@RequestBody @Valid FileAddReq fileAddReq, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResponseUtil.getFailedRes("00005","添加文件参数校验失败");
        }
        MethodExcuResult result=fileService.saveFileOrFolder(fileAddReq);
        if (result.isSuccess()){
            return BaseResponse.builder()
                    .errorCode(StatusCodeEnum.SUCCESS_CODE.getCode())
                    .errorMessage(StatusCodeEnum.SUCCESS_CODE.getMessage())
                    .body(result.getResult())
                    .build();
        }else{
            return ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
    }

    @PutMapping("/renameFile")
    public BaseResponse renameFile(@RequestBody @Valid RenameFileReq renameFileReq,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResponseUtil.getFailedRes("098765434567890-","文件重命名参数校验失败");
        }
        MethodExcuResult result=fileService.renameFile(renameFileReq);
        if (result.isSuccess()){
            return ResponseUtil.getSuccessRes(result);
        }else {
            return ResponseUtil.getFailedRes("979798799","文件重命名失败");
        }
    }

    /**
     * 新增文件类型
     * @param req
     * @param bindingResult
     * @return
     */
    @PostMapping("/addFileType")
    public BaseResponse addFileType(@RequestBody @Valid AddFileTypeReq req,BindingResult bindingResult){
        BaseResponse baseResponse=BaseResponse.builder().errorCode(StatusCodeEnum.SUCCESS_CODE.getCode()).errorMessage(StatusCodeEnum.SUCCESS_CODE.getMessage()).build();
        if (bindingResult.hasErrors()){
            return ResponseUtil.getFailedRes("0000098","参数校验失败");
        }
        MethodExcuResult result=fileTypeService.addFileType(req);
        if (result.isSuccess()){
            baseResponse.setBody(result.getResult());
        }else {
            baseResponse.setErrorCode("98765467890");
            baseResponse.setErrorMessage(result.getMess());
        }
        return baseResponse;
    }

    /**
     * 删除文件类型
     * @param req
     * @param bindingResult
     * @return
     */
    @DeleteMapping("/deleteFileType")
    public BaseResponse deleteFileType(@RequestBody @Valid DeleteFileTypeReq req,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResponseUtil.getFailedRes("098765","参数校验失败");
        }
        MethodExcuResult methodExcuResult=fileTypeService.deleteFileType(req);
        if (methodExcuResult.isSuccess()){
            return ResponseUtil.getSuccessRes(methodExcuResult.getResult());
        }else {
            return ResponseUtil.getFailedRes("w3456789","文件类型删除失败");
        }

    }

    /**
     * 获取文件类型列表
     * @param userId
     * @return
     */
    @GetMapping("/fileTypeAllList")
    public BaseResponse getFileTypes(String userId){
        if (StringUtils.isBlank(userId)){
            //从sessionUser获取用户信息
            return ResponseUtil.getFailedRes("98765456789","参数校验失败");
        }
        QueryFileTypesReq req=new QueryFileTypesReq();
        req.setUserId(userId);
        MethodExcuResult result=fileTypeService.getFileTypes(req);
        if (result.isSuccess()){
            return ResponseUtil.getSuccessRes(result.getResult());
        }else {
            return ResponseUtil.getFailedRes("0000001","文件类型查询失败");
        }
    }

}
