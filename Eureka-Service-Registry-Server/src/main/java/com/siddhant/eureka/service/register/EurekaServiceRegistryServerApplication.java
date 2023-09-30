package com.siddhant.eureka.service.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceRegistryServerApplication.class, args);
	}

}
