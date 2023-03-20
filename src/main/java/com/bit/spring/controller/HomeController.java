package com.bit.spring.controller;

import com.bit.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showHome() {
        return "index";
    }

    @RequestMapping("/encrypt")
    public String encrypt() {
//        userService.encrypt();
        System.out.println("encrypted");

        return "redirect:/";
    }
}
