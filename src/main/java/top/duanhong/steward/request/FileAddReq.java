package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 文件请求参数
 * @date 2019/8/25
 */
@Data
public class FileAddReq {
    @NotBlank(message = "文件名不能为空")
    private String name;
    @NotBlank(message = "类型id不能为空")
    private String fileTypeId;
    @NotBlank(message = "file or folder不能为空")
    private String type;
    private String remark;
    private String parentId;
    private String content;
    @NotBlank(message = "用户Id不能为空")
    private String userId;
}
