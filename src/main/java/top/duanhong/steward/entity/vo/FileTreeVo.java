package top.duanhong.steward.entity.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author duanhong
 * @description 文件信息
 * @date 2019/9/4
 */
@Data
public class FileTreeVo {
    private String fileId;

    private String fileMongoId;

    private String name;

    private Integer fileNum;

    private String remark;

    private String parentId;

    private String content;

    private String type;

    private String status;

    private String fileTypeId;

    private Date createTime;

    private Date updateTime;

    private String userId;

    private List<FileTreeVo> childrenFileList;

}
