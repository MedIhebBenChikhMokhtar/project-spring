package com.pds.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekajdidApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekajdidApplication.class, args);
	}
}
