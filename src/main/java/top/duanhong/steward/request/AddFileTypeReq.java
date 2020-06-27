package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 添加文件类别请求参数
 * @date 2019/9/4
 */
@Data
public class AddFileTypeReq {
    @NotBlank(message = "用户Id不能为空")
    private String userId;

    @NotBlank(message = "文件类别名称不能为空")
    private String typeLabel;

    private String typeCode;
}
