package com.fencaibc.spring.cloud.edu.eureka.open;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 作者 粉菜编程学院
 * 微信公众号 fencaibc
 * JAVA架构师百万年薪公开课
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringBootEureka {

    private static Logger logger = LoggerFactory.getLogger(SpringBootEureka.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootEureka.class, args);
        logger.info(" EurekaServer SpringBootStrap start !");
    }
}
