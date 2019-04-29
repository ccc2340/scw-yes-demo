package com.scw.yes.infrastructure.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 16:21
 */
@SpringBootApplication
@EnableEurekaClient
public class YesGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesGatewayApplication.class, args);
    }
}
