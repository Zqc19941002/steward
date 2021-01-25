package top.duanhong.steward.controller.chat.params;

import lombok.Data;

import java.util.Date;

@Data
public class ChatMessageVo {
    private String id;

    private String content;

    private String senderId;

    private String userName;

    private Date sendDate;

    private Date sendTimestamp;

    private Boolean msgSystem;

    private Boolean saved;

    private Boolean distributed;

    private Boolean seen;

    private Boolean disableActions;

    private Boolean disableReactions;
}
