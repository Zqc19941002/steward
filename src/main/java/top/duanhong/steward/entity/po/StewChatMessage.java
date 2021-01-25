package top.duanhong.steward.entity.po;

import java.util.Date;

public class StewChatMessage {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId == null ? null : senderId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public Date getSendTimestamp() {
        return sendTimestamp;
    }

    public void setSendTimestamp(Date sendTimestamp) {
        this.sendTimestamp = sendTimestamp;
    }

    public Boolean getMsgSystem() {
        return msgSystem;
    }

    public void setMsgSystem(Boolean msgSystem) {
        this.msgSystem = msgSystem;
    }

    public Boolean getSaved() {
        return saved;
    }

    public void setSaved(Boolean saved) {
        this.saved = saved;
    }

    public Boolean getDistributed() {
        return distributed;
    }

    public void setDistributed(Boolean distributed) {
        this.distributed = distributed;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public Boolean getDisableActions() {
        return disableActions;
    }

    public void setDisableActions(Boolean disableActions) {
        this.disableActions = disableActions;
    }

    public Boolean getDisableReactions() {
        return disableReactions;
    }

    public void setDisableReactions(Boolean disableReactions) {
        this.disableReactions = disableReactions;
    }
}