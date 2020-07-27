package mall.staringpoint.core.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置
 *
 * @Author: FengJie
 * @Date: 2020/7/26 18:18
 */
@Configuration
@EnableSwagger2
@EnableConfigurationProperties
public class SwaggerAutoConfiguration {

    private static final String BASE_PACKAGE = "com.framework";
    private static final String VERSION = "1.0";

    @Bean
    @ConditionalOnBean(ApiInfo.class)
    @ConditionalOnClass(Docket.class)
    @ConditionalOnMissingBean(Docket.class)
    public Docket docket(ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    @Bean
    @ConditionalOnClass(ApiInfo.class)
    @ConditionalOnMissingBean(ApiInfo.class)
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SwaggerAPI")
                .description("起点商城接口文档")
                .version(VERSION)
                .build();
    }
}
