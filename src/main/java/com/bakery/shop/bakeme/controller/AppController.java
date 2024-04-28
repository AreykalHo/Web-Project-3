package com.bakery.shop.bakeme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/home")
    public String home() {
        return "home/home";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart/cart";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact/contact";
    }

    @GetMapping("/team")
    public String team() {
        return "team/team";
    }

    @GetMapping("/login")
    public String login() {
        return "login/login";
    }

}
