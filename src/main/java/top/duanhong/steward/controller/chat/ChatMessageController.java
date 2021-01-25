package top.duanhong.steward.controller.chat;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.duanhong.steward.controller.chat.params.QueryChatMessageReq;
import top.duanhong.steward.response.SysBaseResponse;
import top.duanhong.steward.utils.ResponseUtil;

@Slf4j
@RestController
@RequestMapping("/chatMessage")
public class ChatMessageController {

    @GetMapping("/list")
    public SysBaseResponse queryChatMessage(QueryChatMessageReq queryChatMessageReq){
        log.debug("查询聊天消息列表入参：{}", JSON.toJSONString(queryChatMessageReq));
        SysBaseResponse sysBaseResponse= ResponseUtil.getSuccessRes(null);

        return sysBaseResponse;
    }

}
