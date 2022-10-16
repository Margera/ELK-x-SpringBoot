package com.elk.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetricsApplication {

// Docker compose ELK - https://github.com/lemoncode21/docker-loging-elk
// Configuration SpringBoot - https://github.com/lemoncode21/springboot-logging-elk

	public static void main(String[] args) {
		SpringApplication.run(MetricsApplication.class, args);
	}

}
