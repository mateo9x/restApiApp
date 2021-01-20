package com.mateo9x.restapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/logsuccess")
    public String loginSuccess(HttpSession session, Principal principal){
        session.setAttribute("userAttribute",principal.getName());
        return "index_logged";
    }


}
