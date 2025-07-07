package com.jobapp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class for setting up OpenAPI (Swagger) documentation.
 */

@Configuration
public class OpenApiConfig {

    /**
     * Creates a custom OpenAPI bean for configuring Swagger documentation.
     *
     * @return An OpenAPI object with customized information about the API.
     */
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("JOB App API")
                        .version("1.0")
                        .description("API documentation for the JOB App "));
    }
}