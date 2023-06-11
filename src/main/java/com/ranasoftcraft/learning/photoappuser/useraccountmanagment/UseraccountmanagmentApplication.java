package com.ranasoftcraft.learning.photoappuser.useraccountmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UseraccountmanagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseraccountmanagmentApplication.class, args);
	}

}
