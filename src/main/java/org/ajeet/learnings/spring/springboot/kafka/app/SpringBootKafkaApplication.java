package org.ajeet.learnings.spring.springboot.kafka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@SpringBootApplication
@ComponentScan("org.ajeet.learnings.spring")
public class SpringBootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication.class, args);
	}

	/**
	 * We are using a StringDeserializer in kafka consumer properties
	 *  And this convertor is converting the message from string to required type.
	 *
	 * @return
	 */
	@Bean
	public RecordMessageConverter converter() {
		return new StringJsonMessageConverter();
	}
}
