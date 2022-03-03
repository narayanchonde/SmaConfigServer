package com.app.NTech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmaConfigServerApplication.class, args);
		System.out.println("Config Server Started  ...");
	}

}
