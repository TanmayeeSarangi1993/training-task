package com.trainings.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



//Dev _ MYSQL

@Configuration
@Profile("Production")
public class ProdDatabseConfig implements DatabaseConfig{

	@Bean
	@Override
	public DataSource createDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//dataSource.getConnection(username, password);
	//	dataSource.getUrl()

		System.out.println("Creating Production Database Instance");
		
		

		return dataSource;
	}
}
