package com.first.project.Hello.World

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HelloWorldApplication {

	static void main(String[] args) {
		SpringApplication app = new SpringApplication(HelloWorldApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8084"));
		//Test 3
		app.run(args);
	}

}



