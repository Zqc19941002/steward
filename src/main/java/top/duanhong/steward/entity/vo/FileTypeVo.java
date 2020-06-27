package top.duanhong.steward.entity.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author duanhong
 * @description 文件类型信息
 * @date 2019/9/5
 */
@Data
public class FileTypeVo {
    private String fileTypeId;

    private String typeLabel;

    @DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
    private Date updateTime;

    private String typeCode;

    private List<FileTreeVo> all=new ArrayList<>();

    private List<FileTreeVo> recent=new ArrayList<>();
}
