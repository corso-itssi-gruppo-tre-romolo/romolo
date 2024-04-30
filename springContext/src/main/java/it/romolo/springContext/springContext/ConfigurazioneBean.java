package it.romolo.springContext.springContext;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan 
public class ConfigurazioneBean {
	 @Bean (name = "sc")
	    public Scanner scanner() {
	        return new Scanner(System.in);
	    }
}
