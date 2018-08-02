package com.training.sparkworks;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class ReadMovieTweets {
	
	public static void main(String[] args) {
		String appName = "sampleApp";
		//now u got 2 instance of spark of this can be got from remote.instance
		String sparkMaster = "local[2]";
		
		
		
		JavaSparkContext spContext = null;
		
		SparkConf  conf = new SparkConf().setAppName(appName).setMaster(sparkMaster);
		
		//creating spark context in config
		spContext = new JavaSparkContext(conf);
		
		//read file into RDD
		
		JavaRDD<String> tweetsRDD = spContext.textFile("./data/movietweets.csv");
		
		tweetsRDD.take(5).forEach(System.out::println);
		
		
		
		int count = (int)  tweetsRDD.count();
		
		System.out.println("Number of Tweets are"+count);
		
		JavaRDD<String>  upperCaseRDD = tweetsRDD.map(temp -> temp.toUpperCase());
		
		upperCaseRDD.take(10).forEach(System.out::println);
		
		
	}

}
