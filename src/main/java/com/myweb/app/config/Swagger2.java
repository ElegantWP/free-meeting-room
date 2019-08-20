package com.myweb.app.config;

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
 * @author weipan
 * @date 2019/8/20 22:41
 * @description
 */
@Configuration
@EnableSwagger2
public class Swagger2 {

  @Bean
  public Docket createRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
        .paths(PathSelectors.any())
        .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Spring Boot中使用Swagger2构建RESTful APIs")
        .description("更多FreeMetting Room 的RestFul的API 文档")
        .termsOfServiceUrl("双立人小组的FreeMeetingRom")
        .version("1.0")
        .build();
  }

}
