package com.kafka.training;

public class Client {
    public static void main(String[] args) {
		Boolean isAsync = true;
		
		Producer producer = new Producer(KafkaProperties.Topic2,isAsync,"firstTest");
		producer.start();
		
		System.out.println("Started Producer");
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		producer.setInterrupt(true);
	}
}
