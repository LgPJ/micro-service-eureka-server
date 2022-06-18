package com.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**Notacion para habilitar eureka server dentro del proyecto */
@EnableEurekaServer
@SpringBootApplication
public class MicroServiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceEurekaServerApplication.class, args);
	}

}
