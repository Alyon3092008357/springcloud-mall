package com.alyon.demo.swagger.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

/**
 * @ClassName SwaggerConfiguration
 * @Description: TODO
 * @Author liang
 * @Date 2020/3/13
 * @Version V1.0
 **/
@Configuration
@ConditionalOnProperty(name = "demo.swagger.enabled", matchIfMissing = true)
@Import({
        Swagger2DocumentationConfiguration.class
})
public class SwaggerConfiguration {
}
