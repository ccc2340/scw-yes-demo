package com.scw.yes.infrastructure.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 15:24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class YesConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesConfigServerApplication.class, args);
    }
}
