package top.duanhong.steward.controller.chat.params;

import lombok.Data;

import java.util.Date;

@Data
public class AddChatRoomReq {
    private String roomName;
    private String roomDesc;
    private String roomAvatar;
    private Date expiryTime;
    private boolean isAlways;
    private String userId;
}
