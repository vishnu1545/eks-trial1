package com.infy.secretsDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class Controller {

	@Autowired
	private Environment env;
	
	/*
	 * @GetMapping("/getSecrets") public String getSecrets(@RequestParam String
	 * secret) { String sec=env.getProperty(secret); if(sec == null) return
	 * "Null was returned"; else if(sec=="" || sec==" ") return
	 * "Space was returned"; return sec; }
	 * 
	 * @GetMapping("/") public String check() { return "Working Properly"; }
	 */
	@Scheduled(initialDelay = 10000, fixedDelay = 5000 )
	public void props() {
		String message= env.getProperty("messageConfig");
		String secret1= env.getProperty("username");
		String secret2=env.getProperty("password");
		
		System.out.println("Message = "+message+"  username = "+secret1+"  password = "+secret2); 
		
	}
}
