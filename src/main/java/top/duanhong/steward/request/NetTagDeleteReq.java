package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author duanhong
 * @description 网络标签删除请求
 * @date 2019/8/15
 */
@Data
public class NetTagDeleteReq {
    @NotBlank(message = "网络标签Id不能为空")
    private String tagId;
}
