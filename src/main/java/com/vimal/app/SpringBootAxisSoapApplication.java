package com.vimal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vimal.app")
public class SpringBootAxisSoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAxisSoapApplication.class, args);
	}

}
