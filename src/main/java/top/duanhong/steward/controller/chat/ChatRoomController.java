package top.duanhong.steward.controller.chat;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.netflix.discovery.converters.Auto;
import com.qiniu.common.QiniuException;
import com.qiniu.storage.model.DefaultPutRet;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import top.duanhong.steward.controller.chat.params.AddChatRoomReq;
import top.duanhong.steward.controller.chat.params.QueryChatRoomReq;
import top.duanhong.steward.enumeration.StatusCodeEnum;
import top.duanhong.steward.response.MethodExecuteResult;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.service.chat.ChatRoomService;
import top.duanhong.steward.service.file.QiNiuFileService;
import top.duanhong.steward.utils.ResponseUtil;
import top.duanhong.steward.utils.StringUtil;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/chatRoom")
public class ChatRoomController {

    @Autowired
    private ChatRoomService chatRoomService;

    @Autowired
    private QiNiuFileService qiNiuFileService;

    @GetMapping("/list")
    public SysBaseResponse queryChatRoom(QueryChatRoomReq queryRoomReq){
        log.debug("查询聊天室列表入参：{}", JSON.toJSONString(queryRoomReq));
        SysBaseResponse sysBaseResponse= ResponseUtil.getSuccessRes(null);
        MethodExecuteResult result=chatRoomService.queryChatRoom(queryRoomReq);
        if (result.isSuccess()){
            sysBaseResponse.setBody(result.getData());
        }else {
            sysBaseResponse.setErrorCode(StatusCodeEnum.ERROR_CODE.getCode());
            sysBaseResponse.setErrorMessage(StatusCodeEnum.ERROR_CODE.getMessage());
        }
        return sysBaseResponse;
    }

    @PostMapping("/add")
    public SysBaseResponse addChatRoom(@RequestBody @Valid AddChatRoomReq addChatRoomReq, BindingResult bindingResult, HttpServletRequest request){
        log.debug("新增聊天室入参：{}", JSON.toJSONString(addChatRoomReq));
        SysBaseResponse sysBaseResponse= ResponseUtil.getSuccessRes(null);
        if (bindingResult.hasErrors()){
            sysBaseResponse.setErrorCode(StatusCodeEnum.REQ_PARAM_ERROR.getCode());
            sysBaseResponse.setErrorMessage(StatusCodeEnum.REQ_PARAM_ERROR.getMessage());
            return sysBaseResponse;
        }
        addChatRoomReq.setUserId("duanhong");
        if (StringUtils.isBlank(addChatRoomReq.getRoomAvatar())){
            addChatRoomReq.setRoomAvatar("no_avatar");
        }
        MethodExecuteResult result=chatRoomService.addChatRoom(addChatRoomReq);
        if (result.isSuccess()){
            sysBaseResponse.setBody(result.getData());
        }else {
            sysBaseResponse.setErrorCode(StatusCodeEnum.ERROR_CODE.getCode());
            sysBaseResponse.setErrorMessage(StatusCodeEnum.ERROR_CODE.getMessage());
        }
        return sysBaseResponse;
    }



}
