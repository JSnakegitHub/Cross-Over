package com.crossover.techtrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.crossover.techtrial","com.crossover.techtrial.controller",
	"com.crossover.techtrial.exceptions","com.crossover.techtrial.model",
	"com.crossover.techtrial.repository","com.crossover.techtrial.service",})
@EntityScan("com.crossover.techtrial")
@EnableJpaRepositories("com.crossover.techtrial.repository")
public class CrossBlogsApplication {
	public static void main(String[] args) {
		SpringApplication.run(CrossBlogsApplication.class, args);
	}
}
