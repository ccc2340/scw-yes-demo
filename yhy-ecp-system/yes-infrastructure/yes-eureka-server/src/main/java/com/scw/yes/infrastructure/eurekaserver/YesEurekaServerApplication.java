package com.scw.yes.infrastructure.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 14:51
 */
@SpringBootApplication
@EnableEurekaServer
public class YesEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesEurekaServerApplication.class, args);
    }
}
