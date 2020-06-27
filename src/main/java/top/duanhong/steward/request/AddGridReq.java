package top.duanhong.steward.request;

import lombok.Data;

/**
 * @author zhangqc
 * @description
 * @date 2020/2/21
 */
@Data
public class AddGridReq {

    private String id;

    private String latitudeCenter;

    private String leftDownLat;

    private String leftDownLon;

    private String leftUpLat;

    private String leftUpLon;

    private String longitudeCenter;

    private String rightDownLat;

    private String rightDownLon;

    private String rightUpLat;

    private String rightUpLon;

}
