package top.duanhong.steward;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Cacheable
@SpringBootApplication
@MapperScan("top.duanhong.steward.mapper")
public class StewardApplication {

    public static void main(String[] args) {
        SpringApplication.run(StewardApplication.class, args);
    }

}
