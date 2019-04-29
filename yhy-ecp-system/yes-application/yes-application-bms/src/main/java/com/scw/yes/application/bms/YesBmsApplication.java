package com.scw.yes.application.bms;

import com.scw.yes.service.common.facade.feign.EmailApi;
import com.scw.yes.service.common.facade.feign.SmsApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description
 * @Author chenguagxue
 * @CreateDate 2019-04-28 17:17
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = {SmsApi.class, EmailApi.class})
public class YesBmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YesBmsApplication.class, args);
    }
}
