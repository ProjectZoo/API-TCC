package com.gerenciador.gerenciador.config;

import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket productApi(){
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.gerenciador.gerenciador"))
        .patchs(PathSelectors.regex("/api.*"))
        .build()
        .apiInfo(metaInfo());
    }
private ApiInfo metaInfo(){ 
    ApiInfo ApiInfo = new ApiInfo(
        "Produtos API REST",
        "API REST teste Quiz One,",
        "1.0",
        "Terms of Service",
        new Contact("Joao", "https://github.com/projectzoo",
        "joaovictorbezerradelima695@gmail.com"),
        "Apache License Version 2.0",
        "https://www.apache.org/license.html",
        new ArrayList<VendorExtension>());

        return apiInfo;
    }
}