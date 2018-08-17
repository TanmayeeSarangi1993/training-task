package com.kafka.training;

import java.util.Arrays;
import java.util.Properties;

public class KafkaConsumerClient {
	public static void main(String[] args) {
		
		 Properties properties = new Properties();
		 // identify the kafka server details
		 properties.setProperty("bootstrap.servers", "localhost:9092");
		 properties.setProperty("key.serializer", StringSerializer.class.getName());
		 properties.setProperty("value.serializer", StringSerializer.class.getName());

		
		 KafkaConsumer<String, String> KafkaConsumer = new KafkaConsumer<String,String>(properties);
		 
		 
		 KafkaConsumer.subscribe(Arrays.asList("topicA"));
		 
		 
		 while(true) {
			 ConsumerRecords<String, String>  consumerRecords = KafkaConsumer.poll(1000);
			 
			 
			 System.out.println("Count Number of messages Got" + consumerRecords.count());
			 
			 for(ConsumerRecord<String, String>  temp : consumerRecords) {
				 System.out.println("Key:"  + temp.Key() + ",Value:"+);
				 
				 
				 
				 
			 }
		 }
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
