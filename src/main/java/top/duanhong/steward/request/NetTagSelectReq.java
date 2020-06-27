package top.duanhong.steward.request;

import lombok.Data;

import java.util.Date;

/**
 * @author duanhong
 * @description 网络标签查询请求
 * @date 2019/8/12
 */
@Data
public class NetTagSelectReq {
    private String tagId;

    private String netTagTitle;

    private String tagPath;

    private Date createTime;

    private Date updateTime;

    private String tagRemark;

    private String type;

    private String theme;

    private int page;

    private int pageSize;
}
