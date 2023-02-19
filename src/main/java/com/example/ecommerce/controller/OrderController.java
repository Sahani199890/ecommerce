package com.example.ecommerce.controller;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ecommerce-order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place-order")
    public ResponseEntity<Order> placeOrder(@RequestBody Order order ){
        orderService.placeOrder(order);
        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }
    @GetMapping("/get-order")
    public Order getOrder(@RequestParam Integer orderId){
        return orderService.getOrder(orderId);
    }

}
