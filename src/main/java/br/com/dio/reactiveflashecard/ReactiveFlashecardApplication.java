package br.com.dio.reactiveflashecard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableReactiveMongoAuditing;

@SpringBootApplication
@EnableReactiveMongoAuditing(dateTimeProviderRef = "dateTimeProviderRef")
public class ReactiveFlashecardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveFlashecardApplication.class, args);
	}

}
