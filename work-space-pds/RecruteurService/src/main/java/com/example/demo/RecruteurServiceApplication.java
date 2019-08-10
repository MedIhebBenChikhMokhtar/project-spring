package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class RecruteurServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(RecruteurServiceApplication.class, args);
	}
}
