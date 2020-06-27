package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 网络标签新增请求
 * @date 2019/8/15
 */
@Data
public class NetTagAddReq {
    @NotBlank(message = "网络标签不能为空")
    private String tagTitle;

    @NotBlank(message = "网络路径不能为空")
    private String tagPath;

    private String tagRemark;
}
