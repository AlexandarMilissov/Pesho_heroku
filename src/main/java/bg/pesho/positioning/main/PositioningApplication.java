package bg.pesho.positioning.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "bg.pesho.positioning.controller", "bg.pesho.positioning.db.repository", "bg.pesho.positioning.service"})
@EnableJpaRepositories("bg.pesho.positioning.db.repository")
@EntityScan("bg.pesho.positioning.db.entity") 
public class PositioningApplication {

	public static void main(String[] args) {
		SpringApplication.run(PositioningApplication.class, args);
	}

}