package com.training.Helloi18n;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
	@Bean(name = "english")
 public Greeting englishGreet() {
	return new GreetEnglish();
	 }
 @Bean(name = "french")
 public Greeting FrenchGreet() {
	return new GreetFrench();
	 }
}
