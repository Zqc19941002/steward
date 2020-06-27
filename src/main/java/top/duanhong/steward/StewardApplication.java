package top.duanhong.steward;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Cacheable
@SpringBootApplication
@EnableEurekaClient
@ConfigurationPropertiesScan
@MapperScan({"top.duanhong.steward.mapper.gmapper","top.duanhong.steward.mapper.smapper"})
public class StewardApplication {

    public static void main(String[] args) {
        SpringApplication.run(StewardApplication.class, args);
    }

}
