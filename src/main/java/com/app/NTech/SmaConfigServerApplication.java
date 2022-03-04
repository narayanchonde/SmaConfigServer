package com.app.NTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SmaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmaConfigServerApplication.class, args);
		System.out.println("Config Server Started  ...");
	}

}
