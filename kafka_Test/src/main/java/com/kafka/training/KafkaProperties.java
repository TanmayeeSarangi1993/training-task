package com.kafka.training;

public interface KafkaProperties {

	String Topic1 = "sampletopic";
	String Topic2 = "sampletopic2";
	
	String KAFKA_SERVER_URL = "localhost";
	int KAFKA_SERVER_PPORT = 9092;
	
	int KAFKA_PRODUCER_BYFFER_SIZE = 100 *1024;
	int CONNECTION_TIME_OUT = 1000 *10 *10;
	
	String CLIENT_ID = "SimpleConsumerDemoClient";
	
	String PRODUCER_CLIENT_ID = "demo client";
	//private String geTopic
}
