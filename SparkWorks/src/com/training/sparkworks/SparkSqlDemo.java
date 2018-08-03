package com.training.sparkworks;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.RowFactory;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.dmg.pmml.DataType;
import org.netlib.lapack.Ssycon;

import static org.apache.spark.sql.functions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.training.commons.SparkConnection;

public class SparkSqlDemo {
   public static void main(String[] args) {
	   Logger.getLogger("org").setLevel(Level.ERROR );
		Logger.getLogger("akka").setLevel(Level.ERROR);
		
		JavaSparkContext sparkContext = SparkConnection.getContext();
		SparkSession spSession = SparkConnection.getSession();
		
		Dataset<Row> empDatafields = spSession.read().json("./data/spark.json");
		
		empDatafields.show();
		empDatafields.printSchema();
		
		
		//data queries
		System.out.println("SELECT Demo");
		empDatafields.select("name","salary").show();
		
		//dataqueries in condition
		
		System.out.println("dataquery in selection");
		empDatafields.where("gender='male'").show();
		
		empDatafields.where("gender='male' and salary > 3000").show();
		
		//grop by id,average salary ,max age
		
		Dataset<Row>  summaryData = empDatafields.groupBy(col("deptid")).agg(avg(empDatafields.col("salary")),max(empDatafields.col("age")));
		summaryData.show();
		// ----try with bean class--------
		
		
		Department dept1 = new Department(100,"devlopement");
		Department dept2 = new Department(200,"Testing");
		
		
		
		List<Department> depList = new ArrayList<Department>();
		
		
		depList.add(dept1);
		depList.add(dept2);
		
		Dataset<Row> depDataFields = spSession.createDataFrame(depList, Department.class);
		
		System.out.println("Department contents are");
		depDataFields.show();
		
		System.out.println("join employee with dept");
		Dataset<Row> empDeptJoin = empDatafields.join(depDataFields,col("deptid").equalTo(col("departmentid")));
		
		empDeptJoin.show();
		
		System.out.println("----join with aggreegate-----------");
		
		empDeptJoin.where("age>30").groupBy("deptid").agg(avg("salary"),max("age")).show();
		
		//to load the data from CSV
		
		Dataset<Row> autoData = spSession.read().option("header", "true").csv("./data/auto-data.csv");
		autoData.show(5);
		
		//creating RDD with row objects
		Row row1 = RowFactory.create(1,"India","Bengaluru");
		Row row2 = RowFactory.create(1,"USA" ,"Reston");
		Row row3 = RowFactory.create(3,"UK","Steevenscreek");
		
		List<Row> rList = new ArrayList<Row>();
		
		rList.add(row1);
		rList.add(row2);
		rList.add(row3);
		
		JavaRDD<Row> rowRDD = sparkContext.parallelize(rList);
		
		StructType schema = DataTypes.createStructType(new StructField[] {
						DataTypes.createStructField("id", DataTypes.IntegerType, false),
						DataTypes.createStructField("country", DataTypes.StringType, false),
						DataTypes.createStructField("city", DataTypes.StringType, false),
				});
				Dataset<Row> tempDataFields = spSession.createDataFrame(rowRDD, schema);
				
				tempDataFields.show();
				
				
				//working with csv data,with sql statments
				//provide the data is kept in table like format
				//the presistance will be only till the end of programr
				//meaning temporary
				
				
				
				autoData.createOrReplaceTempView("autos");
				System.out.println("Temp Table Contents:");
				
				
				System.out.println("showing all the fields with hp grater than 200");
				spSession.sql("select * from autos where hp > 200").show();
         		
				//to find make max of RPM from autos grop by make
				
				System.out.println("to find make,maximum RPMfrom autos group by make");
				spSession.sql("select make,max(rpm) from autos"+" group by make order by 2").show();
				
				//covert dATAFRram to javaRDD
				JavaRDD<Row> autoRDD = autoData.rdd().toJavaRDD();
				
				//READING THE DATA FROM mySql DB 
				//db(exdb),table(employee)
				
				Map<String,String> jdbcConnectParams = new HashMap<String,String>();
				
				
				jdbcConnectParams.put("url", "jdbc:mysql://localhost:3306/sys");
				jdbcConnectParams.put("driver", "com.mysql.jdbc.Driver");
				jdbcConnectParams.put("dbtable", "employee");
				jdbcConnectParams.put("user", "root");
				jdbcConnectParams.put("password", "root@123");
				
				
				System.out.println("create a datafram from a db table (employee)");
				
				Dataset<Row> sqlDataFields = spSession.read().format("jdbc").options(jdbcConnectParams).load();
				
				sqlDataFields.show();
				
}
}
