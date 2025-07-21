package com.example.A_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AConfigServerApplication.class, args);
	}

}
