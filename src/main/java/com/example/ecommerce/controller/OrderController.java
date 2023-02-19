package com.example.ecommerce.controller;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ecommerce-order")
public class OrderController {

    @Autowired
    private OrderService orderService;



    @GetMapping("/get-order")
    public Order getOrder(@RequestParam Integer orderId){
        return orderService.getOrder(orderId);
    }

}
