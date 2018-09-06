package com.kyle.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
* @ author: Administrator
* @ Description: EnableConfigServer 注解开启配置服务器功能
* @ params:
* @ date: 21:57 2018/9/5
* @ return: 
**/        
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
