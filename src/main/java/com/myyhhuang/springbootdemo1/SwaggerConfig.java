package com.myyhhuang.springbootdemo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
        @Bean
        public OpenAPI initOpenAPI() {
                return new OpenAPI().info(
                                new Info().title("My Project API").description("OpenAPI").version("v1.0"));
        }
}
