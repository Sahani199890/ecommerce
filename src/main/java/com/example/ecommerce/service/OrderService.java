package com.example.ecommerce.service;

import com.example.ecommerce.dao.IOrder;
import com.example.ecommerce.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private IOrder iOrder;
    public Order getOrder(Integer orderId) {
        return iOrder.findById(orderId).get();
    }
}
