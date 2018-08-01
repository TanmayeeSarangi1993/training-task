package com.kafka.training;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;



import kafka.utils.ShutdownableThread;

public class Consumer extends ShutdownableThread{
	private KafkaConsumer<Integer, String> consumer;
	private String topic;
	

	public Consumer(String name, boolean isInterruptible) {
		super(name, isInterruptible);
		// TODO Auto-generated constructor stub
		  Properties properties = new Properties();
		  properties.setProperty("bootstrap.servers", 
				  KafkaProperties.KAFKA_SERVER_URL + ":"+
						  KafkaProperties.KAFKA_SERVER_PPORT);
		  
		  properties.setProperty("key.deserializer", 
				  IntegerDeserializer.class.getName());
		  
		  properties.setProperty("value.deserializer", 
				  StringDeserializer.class.getName());
		  
		  
		  properties.setProperty("group.id", "MyGroup");
		  properties.setProperty("session.timeout.ms", "18000");
		  
		  
		  consumer = new KafkaConsumer<>(properties);
		  this.topic = name;
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		
		consumer.subscribe(Collections.singleton(this.topic));
		ConsumerRecords<Integer, String> records = consumer.poll(1000);
		
		
		 for (ConsumerRecord<Integer, String> record : records) {
			 System.out.println("recieved msz from Key -> " +
		 record.key() + ", message : " +
					 record.value() + ", @offset : "
			 + record.offset() + ", partition : " + record.partition()  );
			 }
			 try {
			 Thread.sleep(100);
			 } catch (InterruptedException ie) {
			 ie.printStackTrace();
			 }
			 }

		
		
		
		
	}
