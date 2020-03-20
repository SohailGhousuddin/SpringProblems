package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	@GetMapping("/demo")
    public @ResponseBody String showDemo() {
        return "Demo of Hello world";
    }

}
