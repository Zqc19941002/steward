package top.duanhong.steward.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import javax.validation.Valid;

/**
 * @author zhangqc
 * @description
 * @date 2020/3/8
 */
@ConfigurationProperties
@Configuration
//@RefreshScope
@Data
public class NetTagConfiguration {
    @Value("${netTagState}")
    private String netTagState;
}
