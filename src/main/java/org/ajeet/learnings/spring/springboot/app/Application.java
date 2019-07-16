package org.ajeet.learnings.spring.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.ajeet.learnings.spring")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
