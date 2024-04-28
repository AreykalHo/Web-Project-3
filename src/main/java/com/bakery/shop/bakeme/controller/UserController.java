package com.bakery.shop.bakeme.controller;

import com.bakery.shop.bakeme.model.User;
import com.bakery.shop.bakeme.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public User getUser(@PathVariable String username) {
        return userService.findUserByUsername(username);
    }

    // Add other user-related endpoints here
}
