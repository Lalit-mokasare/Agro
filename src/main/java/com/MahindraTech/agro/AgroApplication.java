package com.MahindraTech.agro;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroApplication.class, args);


		System.out.println("Hello India");
        System.out.println("Hello Akshay Bhau");
	}




}
