package top.duanhong.steward.controller.sys.params;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AddSysMenuReq {
    @NotBlank(message = "父级菜单名称不能为空")
    private String parentMenuName;

    @NotBlank(message = "父级菜单ID")
    private String parentMenuId;

    @NotBlank(message = "菜单名称不能为空")
    private String menuName;

    @NotBlank(message = "菜单链接不能为空")
    private String menuKey;

    private String menuIcon;

    private int menuSort;
    private String menuRemarks;
    private String loginName;
}
