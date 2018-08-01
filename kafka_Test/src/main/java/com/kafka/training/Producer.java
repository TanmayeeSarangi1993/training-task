package com.kafka.training;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;



public class Producer extends Thread{
  private final KafkaProducer<Integer, String> producer;
  private String topic;
  private Boolean isAsync;
 private Boolean interrupt;
 private String Name;
  
  public Producer(String topic,Boolean isAsync, String string) {
	  this.topic = topic;
	  this.isAsync = isAsync;
	  interrupt = false;
	  this.Name = string;
	  
	  
	  Properties properties = new Properties();
	  properties.setProperty("bootstrap.servers", 
			  KafkaProperties.KAFKA_SERVER_URL + ":"+
					  KafkaProperties.KAFKA_SERVER_PPORT);
	  
	  properties.setProperty("client.id", 
			  KafkaProperties.PRODUCER_CLIENT_ID);
	  
	  
	  properties.setProperty("key.serializer", IntegerSerializer.class.getName());
		

	  properties.setProperty("value.serializer", StringSerializer.class.getName());
	  
				producer = new KafkaProducer<>(properties)	  ;
	  
  }
	public void run(){
		int messageNo = 1;
		
		while(!interrupt) {
			
			String messageString = "Message from producer" + this.Name +"Count :" + messageNo;
			if(isAsync) {
				long startTime = System.currentTimeMillis();
				ProducerRecord<Integer,String> producerRecord =  new ProducerRecord<Integer,String>(this.topic,messageNo,messageString);
				producer.send(producerRecord,
						new ProducerMessageCallable(startTime,messageNo,messageString)
						);
			}
			else {
				try {
				ProducerRecord<Integer,String> producerRecord =  new ProducerRecord<Integer,String>(this.topic,messageNo,messageString);
				producer.send(producerRecord).get();}
				catch(InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
				
				}
			messageNo ++;
			}
			
		}
	public void setInterrupt(boolean b) {
		// TODO Auto-generated method stub
		this.interrupt = b;
		
	}
	}
	