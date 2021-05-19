package com.example.demo;

import com.example.foo.DataExample;
import com.example.bar.TestSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		DataExample.getUserId();
		TestSample.getUserId();
		SpringApplication.run(DemoApplication.class, args);
	}
}
