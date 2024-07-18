package com.pw.gwhdeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.pw")
public class GwhLocalTools {

	public static void main(String[] args) {
		SpringApplication.run(GwhLocalTools.class, args);
	}

}
