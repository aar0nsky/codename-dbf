package com.dbf.fizzbuzz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FizzBuzzController {
	
	FizzBuzzService fizzBuzzService = new FizzBuzzService();
	
	@RequestMapping("/fizzbuzz-landing")
    public String landing() {
        return "fizzbuzz/fizzbuzz-landing";
    }
	
	@RequestMapping("/fizzbuzz-results")
    public String fizzBuzz(@RequestParam(value="num", required=false, defaultValue="15") String numberOfItems, Model model) {
		String fizzBuzzString = this.fizzBuzzService.fizzBuzz(Integer.parseInt(numberOfItems));
		
		model.addAttribute("fizzBuzzString", fizzBuzzString);
		
        return "fizzbuzz/fizzbuzz-results";
    }
}
