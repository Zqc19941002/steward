package top.duanhong.steward.controller.chat.params;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ChatRoomVo {
    private String roomId;

    private String roomName;

    private String avatar;

    private Date createTime;

    private Date updateTime;

    private Date expiryTime;

    private String roomDesc;

    private String roomState;

    private String unreadCount;

    private List<ChatMessageVo> lastMessage;

    private List typingUsers;

    private List users;
}
