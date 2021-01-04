package top.duanhong.steward.controller.tag.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 查询常用网页标签
 */
@Data
public class CommonNetTagReq {
    private int pageNum;
    private int pageSize;
}
