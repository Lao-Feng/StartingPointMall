package mall.staringpoint.systemconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author FengJie
 */
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "mall.staringpoint.*")
@MapperScan(basePackages = "mall.staringpoint.systemconfig.dao.mapper")
public class SystemConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemConfigApplication.class, args);
    }
}
