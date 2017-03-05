package com.dbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping("/about-us")
    public String aboutUs(@RequestParam(value="dbfName", required=true, defaultValue="Charlie") String dbfName, Model dbf) {
    	dbf.addAttribute("dbfName", dbfName);
    	return "about-us";
    }

}
