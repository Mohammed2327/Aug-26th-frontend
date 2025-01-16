package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/hellouser") // Access via http://localhost:5454/hello/hellouser
    public String getHello(Model model) {
        model.addAttribute("hello", "hello world");
        return "hello_world"; 
    }
}