package com.training.profile;

import javax.activation.DataSource;

public interface DatabaseConfig {
 DataSource createDataSource();
}
