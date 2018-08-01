package com.kafka.training;

public class ClientConsumer {
	public static void main(String[] args) {
		Consumer consumer = new Consumer(KafkaProperties.Topic2,false);
		consumer.start();
	}

}
