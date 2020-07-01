package com.lwc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.print.attribute.standard.MediaSize;

/**
 * Created by lwc on 2020/7/1.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDisCoveryGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDisCoveryGatewayApplication.class);
    }
}
