package com.training.sparkworks;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;

import com.training.commons.DataSource;
import com.training.commons.SparkConnection;
import com.training.commons.Utilities;

public class SparkOperationClient {
   public static void main(String[] args) {
	Logger.getLogger("org").setLevel(Level.ERROR );
	Logger.getLogger("akka").setLevel(Level.ERROR);
	
	JavaSparkContext sparkContext = SparkConnection.getContext();
	//start loading the data
	
	
	//1.load the collection and cache it
	
	JavaRDD<Integer> collData = DataSource.getCollData();
	
	System.out.println("total no of counting "+ collData.count());
	
	//2.load the file and cache it
	
	
	JavaRDD<String> autoDataContent = sparkContext.textFile("./data/auto-data.csv");
	
	System.out.println("no of the records"+autoDataContent.count());
	
	System.out.println("loading data from file");
	
	
	//autoDataContent.take(5).forEach(System.out::println);
	
	Utilities.printStringRDD(autoDataContent, 10);
	
	//autoDataContent.saveAsTextFile("data/auto-data-modified.csv");
	
	
	
	JavaRDD<String> tsvData = autoDataContent.map(str->str.replace(",", "\t"));
	Utilities.printStringRDD(tsvData,5);
	
	String header = autoDataContent.first();
	JavaRDD<String>  autoDtaWithOutHeader = autoDataContent.filter(s ->!s.equals(header));
	
	Utilities.printStringRDD(autoDtaWithOutHeader, 5);
	
	
	//filter those records which has only toyota
	
	
	
	JavaRDD<String> toyotaData = autoDataContent.filter(str-> str.contains("toyota"));
	
	
	System.out.println("----------");
	Utilities.printStringRDD(toyotaData,10);
	
	
	
	System.out.println("after dictinction checking count "+ autoDataContent.distinct().count());
	
	
	
	//autoDataContent.distinct().collect().forEach(System.out::println);
	
	Utilities.printDis(autoDataContent);	
	Utilities.printDis(collData);
	
	
	
	
	//to count number of words in the given RDD
	
	System.out.println("using flatmap");
	
	
	JavaRDD<String> words = toyotaData.flatMap(new FlatMapFunction<String,String>(){

		@Override
		public Iterator<String> call(String t) throws Exception {
			// TODO Auto-generated method stub
			return Arrays.asList(t.split(",")).iterator();
		}
		
	});
	System.out.println("toyota word count"+words.count());
	
	//after cleansing the data
	System.out.println("********after clensing data**********");
	JavaRDD<String> cleanseRDD = autoDataContent.map(new ClenseRDDCars());
	
	Utilities.printStringRDD(cleanseRDD, 5);
	//set operation
	
	JavaRDD<String> words1 = sparkContext.parallelize(Arrays.asList("hello","how","are","you","today"));
	JavaRDD<String> words2 = sparkContext.parallelize(Arrays.asList("hello","how","were","you","yesterday"));
	
	System.out.println("Union operations-set");
	Utilities.printStringRDD(words1.union(words2), 10);
	
	System.out.println("intersection operations-set");
	Utilities.printStringRDD(words1.intersection(words2), 10);
	
	//sum of number in the given RDD
	
	System.out.println(collData.reduce(Integer::sum));
	
	
	System.out.println("numb ="+ toyotaData.mapToDouble( a -> Double.valueOf(a.split(",")[9])).stats().mean());
	
	
	
}
}
