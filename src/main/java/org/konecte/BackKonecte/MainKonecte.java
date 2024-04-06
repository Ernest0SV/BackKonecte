package org.konecte.BackKonecte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MainKonecte {

	public static void main(String[] args) {
		SpringApplication.run(MainKonecte.class, args);
	}

}