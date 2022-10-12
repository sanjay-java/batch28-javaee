package com.cis.fs28.OrderService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class OrderServiceResTfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceResTfulApplication.class, args);
	}

}


// RESTful service ( JAX-RS)
// annotations for REST
// create and test


// REST standard - JAX-RS specification,  spring-web/jersey - implementations
// HTTP protocol
// Request - Response

/// url , types of requests , body of the request, Headers

// https://trc.taboola.com/theweatherchannel/log/3/bulk?route=US%3AUS%3AV&lti=kusto-full-url-5_var&bulkSize=1

//

