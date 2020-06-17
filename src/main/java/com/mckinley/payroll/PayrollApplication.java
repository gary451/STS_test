package com.mckinley.payroll;

import java.util.logging.Logger;

//	Payroll MicroServices
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayrollApplication {

	private final static Logger logger = Logger.getLogger("Payroll Application");
	public static void main(String[] args) 	{		
		logger.info("starting");
		SpringApplication.run(PayrollApplication.class, args);
	}
}
