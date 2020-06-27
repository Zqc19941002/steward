package top.duanhong.steward.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import top.duanhong.steward.request.InsertMessageReq;
import top.duanhong.steward.request.QueryMessageReq;
import top.duanhong.steward.response.BaseResponse;
import top.duanhong.steward.service.MessageService;
import top.duanhong.steward.utils.MethodExcuResult;
import top.duanhong.steward.utils.ResponseUtil;

import javax.validation.Valid;

/**
 * @author duanhong
 * @description 消息通知接口
 * @date 2019/8/16
 */
@RestController
@Slf4j
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/insert")
    public BaseResponse insertMessage(@RequestBody @Valid InsertMessageReq req, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            log.error("新增消息时，参数校验失败");
            return ResponseUtil.getFailedRes("0006","参数校验失败");
        }
        MethodExcuResult result=messageService.insertMessage(req);
        if (result.isSuccess()){
            return ResponseUtil.getSuccessRes(result.getResult());
        }else {
            return ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
    }

    @GetMapping("/query")
    public BaseResponse queryMessage(){
        QueryMessageReq req=new QueryMessageReq();
        MethodExcuResult result=messageService.queryMessage(req);
        if (result.isSuccess()){
            return ResponseUtil.getSuccessRes(result.getResult());
        }else {
            return ResponseUtil.getFailedRes(result.getCode(),result.getMess());
        }
    }
}
