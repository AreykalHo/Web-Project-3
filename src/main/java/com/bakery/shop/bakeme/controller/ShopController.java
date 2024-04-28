package com.bakery.shop.bakeme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bakery.shop.bakeme.model.Product;
import com.bakery.shop.bakeme.service.ProductService;

@Controller
public class ShopController {
    private final ProductService productService;

    public ShopController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/shop")
    public String shop(Model model) {
        Iterable<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "shop/shop";
    }
}