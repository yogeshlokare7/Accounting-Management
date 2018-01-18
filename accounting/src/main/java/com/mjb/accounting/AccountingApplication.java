package com.mjb.accounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AccountingApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(AccountingApplication.class, args);
		System.out.println(context);
	}
}
