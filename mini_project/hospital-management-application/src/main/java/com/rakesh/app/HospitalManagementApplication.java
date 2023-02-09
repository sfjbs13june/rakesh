package com.rakesh.app;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers={@Server(url ="/",description = "Hospital Server URL")})
@SpringBootApplication
public class HospitalManagementApplication {


	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
	}

}
