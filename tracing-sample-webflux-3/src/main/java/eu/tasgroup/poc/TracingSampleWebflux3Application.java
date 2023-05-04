package eu.tasgroup.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Hooks;

@SpringBootApplication
public class TracingSampleWebflux3Application {

	public static void main(String[] args) {
		Hooks.enableAutomaticContextPropagation();

		SpringApplication.run(TracingSampleWebflux3Application.class, args);
	}

	@Bean
	public WebClient webClient(WebClient.Builder builder) {
		return builder.build();
	}
}
