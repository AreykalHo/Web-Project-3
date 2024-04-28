package com.bakery.shop.bakeme.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

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

    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {
        if ("admin@example.com".equals(email) && "admin123".equals(password)) {
            return "redirect:/orders";
        } else if ("user@example.com".equals(email) && "user123".equals(password)) {
            return "redirect:/home";
        } else {
            return "login/login";
        }
    }

    @GetMapping("/delivery")
    public String delivery() {
        return "delivery/delivery";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "checkout/checkout";
    }

    @GetMapping("/ordercom")
    public String ordercom() {
        return "ordercom/ordercom";
    }

    @GetMapping("/home")
    @PreAuthorize("hasRole('USER')")
    public String home() {
        return "home/home";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String admin() {
        return "admin/admin";
    }

}
