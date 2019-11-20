package io.turntabl.NorthwindSpringBootTemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class NorthwindSpringBootTemplateApplication {

	public static void main(String[] args) {

		SpringApplication.run(NorthwindSpringBootTemplateApplication.class, args);
	}

	@Bean
	public Maths math(){return new Maths();}
}
