package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 删除文件类型请求参数
 * @date 2019/9/4
 */
@Data
public class DeleteFileTypeReq {
    @NotBlank(message = "文件类型Id不能为空")
    private String fileTypeId;

    @NotBlank(message = "用户名不能为空")
    private String userId;
}
