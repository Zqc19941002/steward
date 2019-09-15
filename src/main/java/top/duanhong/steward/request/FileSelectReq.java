package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 文件查询请求参数
 * @date 2019/8/24
 */
@Data
public class FileSelectReq {
    @NotBlank(message = "文件类别编码不能为空")
    private String fileTypeId;

    @NotBlank(message = "用户id不能为空")
    private String userId;
}
