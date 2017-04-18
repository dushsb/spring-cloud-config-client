package com.libertyinsurance.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@Value("${my.name}")
	String name;
	
	@Value("${datasource.name}")
	String dbName;
	
    @RequestMapping("/")
    public String home() {
    	System.out.println("########## "+dbName);
        return "Hello "+ name + "!";
    }
}
