package com.example.demo;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.example.demo.domain.items;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.service.itemService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Demo21Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo21Application.class, args);
	}
	
	@Bean
	CommandLineRunner runner(itemService itemservice)
	{
		return args-> {
			ObjectMapper objectmapper = new ObjectMapper();
			TypeReference<List<items>> typereference= new TypeReference<List<items>>() {};
			InputStream inputstream = TypeReference.class.getResourceAsStream("/itemPrice.json");
			try {
				List<items> itemlist = objectmapper.readValue(inputstream,typereference);
				itemservice.saveAll(itemlist);
				System.out.println("Items saved");
			}catch(IOException e) 	{
				System.out.println("unable to save user:"+e.getMessage());
			}
			
		};
	}

}
