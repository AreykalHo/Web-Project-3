package com.bakery.shop.bakeme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // @GetMapping("/shop")
    // public String shop() {
    // return "shop";
    // }

    @GetMapping("/cart")
    public String cart() {
        return "cart";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
