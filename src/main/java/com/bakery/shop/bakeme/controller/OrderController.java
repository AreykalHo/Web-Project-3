package com.bakery.shop.bakeme.controller;

import com.bakery.shop.bakeme.model.Order;
import com.bakery.shop.bakeme.repository.OrderRepository;
import com.bakery.shop.bakeme.service.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    public String showOrder(@PathVariable("id") Long id, Model model) {
        Order order = orderRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid order Id:" + id));
        model.addAttribute("orderId", order.getId());
        model.addAttribute("cart_id", order.getCart().getId());
        model.addAttribute("status", order.getStatus());
        return "admin/admin";
    }

    @PostMapping("/order/approve")
    public String approveOrder(@RequestParam("id") Long id) {
        Order order = orderService.getOrderById(id);
        order.setStatus("Approved");
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @PostMapping("/order/reject")
    public String rejectOrder(@RequestParam("id") Long id) {
        Order order = orderService.getOrderById(id);
        order.setStatus("Rejected");
        orderService.saveOrder(order);
        return "redirect:/orders";

    }

    @GetMapping("/orders")
    public String listOrders(Model model) {
        Iterable<Order> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "admin/admin";
    }
}