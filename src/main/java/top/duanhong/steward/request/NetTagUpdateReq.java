package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 网络标签更新请求
 * @date 2019/8/16
 */
@Data
public class NetTagUpdateReq {
    @NotBlank(message = "网络标签Id不能为空")
    private String tagId;

    @NotBlank(message = "网络标签不能为空")
    private String tagTitle;

    @NotBlank(message = "网络路径不能为空")
    private String tagPath;

    private String tagRemark;
}
