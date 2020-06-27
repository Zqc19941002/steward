package top.duanhong.steward.request;

import lombok.Data;

import java.util.List;

/**
 * @author zhangqc
 * @description 查询竞争对手请求
 * @date 2020/2/26
 */
@Data
public class QueryMgmtRivalReq {
    private static final long serialVersionUID = 6571162534471440088L;
    /**
     * 状态
     */
    private String searchType;
    /**
     * 运行商id
     */
    private String teleComoperatorId;
    /**
     * 渠道名称 渠道编码 渠道经理or查询
     */
    private String channelNameMist;
    /**
     * 渠道名称模糊查询
     */
    private String channelName;

    /**
     * 渠道名称等于
     */
    private String channelNameEqualTo;
    /**
     * 渠道编码
     */
    private String channelCode;
    /**
     * 行政区域省份编码
     */
    private String admRegProvinceCode;
    /**
     * 行政区域城市代码
     */
    private String admRegCityCode;
    /**
     * 行政区域区县代码
     */
    private String admRegCountyCode;
    /**
     * 行政区域乡镇代码
     */
    private String admRegTownCode;
    /**
     * 行政区域村代码
     */
    private String admRegVillageCode;
    /**
     * 行政区域区域代码
     */
    private String admRegCode;
    /**
     * 业务区域省份代码
     */
    private String busiRegProvinceCode;

    /**
     * 业务区域城市代码
     */
    private String busiRegCityCode;

    /**
     * 业务区域区县代码
     */
    private String busiRegCountyCode;

    /**
     * 业务区域片区代码
     */
    private String busiRegareaCode;

    /**
     * 业务区域网格代码
     */
    private String busiRegGridCode;

    /**
     * 业务区域微片区代码
     */
    private String busiRegMicroareaCode;

    /**
     * 业务区域区域代码
     */
    private String busiRegCode;
    /**
     * 业务区域区域名称
     */
    private String busiRegName;
    /**
     * 渠道类型一级代码
     */
    private String chlFirstKindId;

    /**
     * 渠道类型二级代码
     */
    private String chlSecondKindId;

    /**
     * 渠道类型三级代码
     */
    private String chlThirdKindId;

    /**
     * 渠道类型四级代码
     */
    private String chlForthKindId;

    /**
     * 渠道类型ID
     */
    private String chlKindId;
    /**
     * 经营模式编码
     */
    protected String businessmode;
    /**
     * 经营性质编码
     */
    private String businessNature;
    /**
     * 建设模式编码
     */
    private String constructMode;
    /**
     * 是否绑定渠道经理<br>
     * 0:未分配   1：已分配
     */
    private String bindMangerFlag;
    /**
     * 渠道经理id
     */
    private String channelManagerId;
    /**
     * 渠道经理名称
     */
    private String channelManagerName;
    /**
     * 渠道经理电话
     */
    private String channelManagerPhone;
    /**
     * 渠道星级编码
     */
    private String channelStarLevel;



    /**
     * 竞争对手编码
     */
    private List<String> rivalCodeList;
    /**
     * 业务网格编码集合
     */
    private List<String> busiRegGridCodeList;
    /**
     * 业务片区编码集合
     */
    private List<String> busiRegAreaCodeList;
    /**
     * 业务区县编码集合
     */
    private List<String> busiRegCountyCodeList;
    /**
     * 业务市编码集合
     */
    private List<String> busiRegCityCodeList;
}
