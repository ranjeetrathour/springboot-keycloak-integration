package com.ranjeet.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * resource: https://medium.com/@iaravinda33/integrating-keycloak-authentication-with-spring-boot-a-complete-guide-98df2c8d244a
 */
@SpringBootApplication
public class KeycloakAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakAppApplication.class, args);
	}

}
