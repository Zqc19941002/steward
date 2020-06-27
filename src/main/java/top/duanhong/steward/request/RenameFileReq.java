package top.duanhong.steward.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author duanhong
 * @description 文件重命名请求
 * @date 2019/9/8
 */
@Data
public class RenameFileReq {
    @NotBlank(message = "文件名不能为空")
    private String name;

    @NotBlank(message = "文件Id")
    private String fileId;
}
