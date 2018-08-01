package com.training.profile;

import java.sql.DriverManager;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//Oracle
@Profile("prod")
@Configuration
public class ProdDatabaseConfig implements DatabaseConfig{

	@Override
	@Bean(name="dataSource")
	public DataSource createDataSource() {
		System.out.println("creating prod database ");
		//DriverManagerDataSource datasource = new DriverManagerDataSource();
	//	DataSource datasource = new DataSource();
		return null;
	}

}
