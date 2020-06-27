package top.duanhong.steward.entity.po;

import java.math.BigDecimal;

/**
 * @author zhangqc
 * @description
 * @date 2020/3/2
 */
public class MgmtRivalChlLonLatBaseInfo {
    private Long channelId;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public Long getChannelId() {
        return this.channelId;
    }

    public void setChannelId(final Long channelId) {
        this.channelId = channelId;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(final BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(final BigDecimal longitude) {
        this.longitude = longitude;
    }
}
