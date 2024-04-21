package edu.iu.c322.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//Unable to run with @SpringBootApplication because of datasource config so exclude
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Test3Application {

	public static void main(String[] args) {
		SpringApplication.run(Test3Application.class, args);
	}

}
