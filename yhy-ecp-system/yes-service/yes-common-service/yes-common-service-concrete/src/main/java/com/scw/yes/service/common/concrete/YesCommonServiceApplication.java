package com.scw.yes.service.common.concrete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 18:42
 */
@SpringBootApplication
@EnableEurekaClient
public class YesCommonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesCommonServiceApplication.class, args);
    }
}
