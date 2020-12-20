package top.duanhong.steward.controller.sys.params;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DeleteMenuReq {
    @NotBlank(message = "菜单Id不能为空")
    private String menuId;
}
