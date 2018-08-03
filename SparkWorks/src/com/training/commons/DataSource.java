package com.training.commons;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class DataSource {
	
	public static JavaRDD<Integer> getCollData(){
		JavaSparkContext spContext = SparkConnection.getContext();
		
		List<Integer> data = Arrays.asList(3,5,6,77,8,889,99,22,56,2,5,6,8,9,10,3);
		
		JavaRDD<Integer> collData = spContext.parallelize(data);
		collData.cache();

		return collData;
		
	}
	}

