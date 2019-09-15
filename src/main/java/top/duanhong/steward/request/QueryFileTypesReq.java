package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 文件类型查询参数
 * @date 2019/9/4
 */
@Data
public class QueryFileTypesReq {
    @NotBlank(message = "用户id不能为空")
    private String userId;
}
