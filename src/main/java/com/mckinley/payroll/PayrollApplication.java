package com.mckinley.payroll;

import org.springframework.boot.Banner;
//	Payroll MicroServices
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String[] args) 	{
		
		SpringApplication springApp = new SpringApplication(PayrollApplication.class);
		
		springApp.setBannerMode(Banner.Mode.OFF);
		
		springApp.run(args);
		
	}
}
