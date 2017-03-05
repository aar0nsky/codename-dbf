package com.dbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbf.service.FizzBuzzService;

@Controller
public class FizzBuzzController {
	
	FizzBuzzService fizzBuzzService = new FizzBuzzService();
	
	@RequestMapping("/fizzbuzz")
    public String greeting(@RequestParam(value="num", required=false, defaultValue="15") String numberOfItems, Model model) {
		String fizzBuzzString = this.fizzBuzzService.fizzBuzz(Integer.parseInt(numberOfItems));
		
		model.addAttribute("fizzBuzzString", fizzBuzzString);
		
        return "fizzbuzz";
    }
}
