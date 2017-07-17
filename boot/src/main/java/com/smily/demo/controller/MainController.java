package com.smily.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ruanzh
 * @since 2017/6/12
 */
@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
