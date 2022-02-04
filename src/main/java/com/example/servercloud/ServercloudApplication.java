package com.example.servercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ServercloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServercloudApplication.class, args);
	}

}
