package com.rocket.contentcalendar;

import com.rocket.contentcalendar.model.Content;
import com.rocket.contentcalendar.model.Status;
import com.rocket.contentcalendar.model.Type;
import com.rocket.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			Content content = new Content(1,
					"My first post in blog using chat gpt",
					"my first blog post",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		} ;
	}

}
