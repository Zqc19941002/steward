package top.duanhong.steward.controller.chat.params;

import lombok.Data;

@Data
public class ChatUser {
    private String id;
    private String username;
    private String avatar;
    private ChatUserStatus status;
}
