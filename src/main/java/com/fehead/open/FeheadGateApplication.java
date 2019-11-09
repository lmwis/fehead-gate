package com.fehead.open;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description:
 * @Author lmwis
 * @Date 2019-11-08 15:23
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class FeheadGateApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeheadGateApplication.class,args);
    }
}
