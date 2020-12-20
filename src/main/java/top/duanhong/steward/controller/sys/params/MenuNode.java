package top.duanhong.steward.controller.sys.params;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MenuNode {
    private String id;

    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    private String menuKey;

    private String icon;

    private String parentId;

    private String remarks;

    private String target;

    private String menuName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    private List<MenuNode> children;
}
