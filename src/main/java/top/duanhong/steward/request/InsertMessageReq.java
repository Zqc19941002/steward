package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author duanhong
 * @description 新增消息请求参数
 * @date 2019/8/16
 */
@Data
public class InsertMessageReq {
    @NotBlank(message = "标题不能为空")
    private String title;

    @NotBlank(message = "描述不能为空")
    private String desc;

    @NotBlank(message = "内容不能为空")
    private String content;
}
