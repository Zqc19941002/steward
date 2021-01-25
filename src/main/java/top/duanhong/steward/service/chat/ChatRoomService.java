package top.duanhong.steward.service.chat;

import top.duanhong.steward.controller.chat.params.AddChatRoomReq;
import top.duanhong.steward.controller.chat.params.QueryChatRoomReq;
import top.duanhong.steward.response.MethodExecuteResult;

public interface ChatRoomService {
    MethodExecuteResult queryChatRoom(QueryChatRoomReq queryRoomReq);

    MethodExecuteResult addChatRoom(AddChatRoomReq addChatRoomReq);
}
