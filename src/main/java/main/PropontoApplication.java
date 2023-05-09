package main;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "model")
@EnableJpaRepositories("repositorie")
@ComponentScan(basePackages = {"controller, service"})
@SpringBootApplication
public class PropontoApplication {
	public static void main(String[] args) {
		SpringApplication.run(PropontoApplication.class, args);		
	}
}
