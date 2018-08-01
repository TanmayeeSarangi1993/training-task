package com.training.hello1Bin;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
	
	@Bean(name="english")
	public Greeting englishGreet() {
		
		return new GreetEnglish();
		
	}
	
	@Bean(name="french")
	public Greeting frenchGreet() {
		
		return new GreetFrench();
	}

	
	@Bean(name="Odiya")
	public Greeting odiyaGreet() {
		
		return new GreetOdiya();
	}
	
	@Bean(name="Bengali")
	public Greeting bengaliGreet() {
		
		return new GreetBengali();
	}
}
