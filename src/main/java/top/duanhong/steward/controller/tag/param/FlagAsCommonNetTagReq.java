package top.duanhong.steward.controller.tag.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class FlagAsCommonNetTagReq {
    @NotBlank(message = "网络标签Id不能为空")
    private String tagId;

    private String state;
}
