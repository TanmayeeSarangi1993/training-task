package com.training.messagesource;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class HeloWorld {
    private String greeting;
    private String message;
    //message resouce entry made in .xml file..u cn do autowire
    
    @Autowired
    private MessageSource messageSource;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getMessage() {
		return message;
	}

	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void sayHelloWorld() {
		System.out.println(messageSource.getMessage("helloworld.greet", new Object[] {greeting,message}, null));
	}
	public void sayHelloWorld_fr() {
		System.out.println(messageSource.getMessage("helloworld.greet", new Object[] {greeting,message}, new Locale("FR")));
	}
}
