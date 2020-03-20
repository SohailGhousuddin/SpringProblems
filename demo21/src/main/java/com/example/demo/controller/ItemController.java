package com.example.demo.controller;
import com.example.demo.domain.items;
import com.example.demo.service.*;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.

@RestController
@RequestMapping("/items")
public class ItemController {
	
private itemService itemService;	

public ItemController(itemService is)  {
	this.itemService=is;
	}

@GetMapping("/list")
public Iterable<items> list() {
	return this.itemService.list();
	}

@GetMapping("/item")
public Iterable<items> item() {
	return this.itemService.list();
	}
@GetMapping("/item/{itemShortName}")
public Iterable<items> item(@PathVariable(value ="itemShortName") String itemShortName) {
	return this.itemService.getShortName(itemShortName);
	}
@GetMapping("/item?category")
public Iterable<items> itemCategory(@RequestParam("category") String category) {
	//return this.itemService.getCategory(category);
	return this.itemService.getSearchCategory(category);
	}
}
