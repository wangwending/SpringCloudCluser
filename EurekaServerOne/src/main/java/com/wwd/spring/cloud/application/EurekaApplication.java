package com.wwd.spring.cloud.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
		* ClassName: EurekaApplication <br/>
		* Function: Eureka Server. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	
	private final static Logger log = LoggerFactory.getLogger(EurekaApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		log.info("Spring CLoud Server Center Success!!!");;
	}
}
