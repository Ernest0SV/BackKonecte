package org.konecte.BackKonecte;

import org.konecte.BackKonecte.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

@SpringBootApplication
@ComponentScan
public class MainKonecte {

	public static void main(String[] args) {
		SpringApplication.run(MainKonecte.class, args);
	}//main
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean =
				new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/usuarios/*");
		registrationBean.addUrlPatterns("/api/oficios/*");
		return registrationBean;
	}//jwtFilter
	
}//class MainKonecte