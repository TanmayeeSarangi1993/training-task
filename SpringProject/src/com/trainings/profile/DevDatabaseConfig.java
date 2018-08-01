package com.trainings.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Development")
@Configuration
public class DevDatabaseConfig implements DatabaseConfig {

	@Override
	@Bean
	public DataSource createDataSource() {
		// TODO Auto-generated method stub

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		System.out.println("Creating Development Database Instance");

		return dataSource;
	}

}
