package com.training.profile;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
@Profile("dev")
public class DevDatabaseConfig implements DatabaseConfig {

	@Override
	@Bean(name="dataSource")
	public DataSource createDataSource() {
		System.out.println("creating dev database ");
		//DriverManagerDataSource datasource = new DriverManagerDataSource();
	//	DataSource datasource = new DataSource();
		return null;
	}

}
