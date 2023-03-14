package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//@Component("database")
public class MsSqlCustomerDal implements ICustomerDal {

	@Value("${database.connectionString}")
	String connectionString;

	@Override
	public void add() {
		System.out.println("Connection String: " + this.connectionString);
		System.out.println("Added to MsSql database");
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
