package com.sai.spring.drools;

import java.io.IOException;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDroolsApplication.class, args);
	}
	
	@Bean
	public KieContainer KieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}
	
}
