package com.example.exampleproject.controller;

import com.example.exampleproject.model.User;
import com.example.exampleproject.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//MVC Controller for controlling for navigation the pages
@Controller
@AllArgsConstructor
public class UserController {
    //need to be changed to service later and not field injection
    UserService userService;

    @GetMapping("")
    public String viewHomePage(){
        return"index.html";
    }
    @GetMapping("/register")
    public String showRegisterPage(Model model){
        model.addAttribute("user",new User());
        return "signup_form.html";
    }

    @PostMapping("/process_register")
    public String processRegister(User user) {

        userService.saveUser(user);
        return "register_success.html";
    }

    @GetMapping("/login")
    public String viewLoginPage () {
        return "login.html";
    }
}
