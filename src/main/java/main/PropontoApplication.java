package main;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "models")
@EnableJpaRepositories("repositories")
@ComponentScan(basePackages = {"controllers, services"})
@SpringBootApplication
public class PropontoApplication {
	public static void main(String[] args) {
		SpringApplication.run(PropontoApplication.class, args);		
	}
}
