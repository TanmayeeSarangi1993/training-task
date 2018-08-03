package com.training.sparkworks;
import static java.lang.System.*;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class ReadMovieTweets {
	public static void main(String[] args) {
		String appNmae= "sampleApp";
		// as of noew we have got two instancs of spark or 
		// this can be got from remote instance
		String sparkMaster="local[2]";
		
		JavaSparkContext javaSparkContext = null;
		
		SparkConf conf= new SparkConf().setAppName(appNmae).setMaster(sparkMaster);
		// creat5eing spark context from configuraton
		javaSparkContext = new JavaSparkContext(conf);
		// read file into RDD
		JavaRDD<String> tweetsRDD = javaSparkContext.textFile("./data/movietweets.csv");
		
		tweetsRDD.take(5).forEach(out::println);
		
		out.println("Count of line "+tweetsRDD.count());
		
		JavaRDD<String> upperCaseRDD = tweetsRDD.map(String::toUpperCase);
		upperCaseRDD.take(5).forEach(out::println);
		
		while(true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
