package br.edu.ifsp.prw3.prw3_2026_1_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO)
public class Prw320261ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prw320261ApiApplication.class, args);
	}

}
