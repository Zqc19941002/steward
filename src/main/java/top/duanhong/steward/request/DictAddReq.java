package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 字典新增
 * @date 2019/8/16
 */
@Data
public class DictAddReq {
    @NotBlank(message = "字典的键不能拿为空")
    private String key;

    @NotBlank(message = "字典的值不能为空")
    private String value;
}
