package top.duanhong.steward.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @author duanhong
 * @description mongo文件
 * @date 2019/8/20
 */
@Data
public class FileDocument {
    private Date uploadDate;
    private String gridfsId;
    private byte content[];

}
