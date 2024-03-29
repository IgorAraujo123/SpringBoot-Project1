package com.curso.Spring_Boot_Expert;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootExpertApplication {

	@Value("${application.name}")
	private String applicationName;

	@Gato
	private Animal animal;

	@Bean(name="executarAnimal")
	public CommandLineRunner executar(){
		return args->{
			this.animal.fazerBarulho();
		};
	}

	@GetMapping("/hello")
    public String helloWord(){
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExpertApplication.class, args);
	}

}
