package com.bit.spring.controller;

import com.bit.spring.model.UserDTO;
import com.bit.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("auth")
    public String auth(HttpSession session, Model model, UserDTO attempt) {
//        userService.register(attempt);
        UserDTO result = userService.auth(attempt);

        if (result != null) {
            session.setAttribute("logIn", result);
            System.out.println("Log In Success");
            return "redirect:/board/showAll/1";
        } else {
            model.addAttribute("message", "로그인 정보를 다시 확인해주세요.");
            System.out.println("Log In Fail");
            return "index";
        }

    }


}
