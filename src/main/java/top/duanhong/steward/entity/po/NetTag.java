package top.duanhong.steward.entity.po;

import java.util.Date;

public class NetTag {
    private String tagId;

    private String netTagTitle;

    private String tagPath;

    private Date createTime;

    private Date updateTime;

    private String tagRemark;

    private String type;

    private String theme;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    public String getNetTagTitle() {
        return netTagTitle;
    }

    public void setNetTagTitle(String netTagTitle) {
        this.netTagTitle = netTagTitle == null ? null : netTagTitle.trim();
    }

    public String getTagPath() {
        return tagPath;
    }

    public void setTagPath(String tagPath) {
        this.tagPath = tagPath == null ? null : tagPath.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTagRemark() {
        return tagRemark;
    }

    public void setTagRemark(String tagRemark) {
        this.tagRemark = tagRemark == null ? null : tagRemark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }
}