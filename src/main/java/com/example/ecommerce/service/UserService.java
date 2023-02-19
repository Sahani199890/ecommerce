package com.example.ecommerce.service;

import com.example.ecommerce.dao.IUser;
import com.example.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUser iUser;

    public void addUser(User user) {
        iUser.save(user);
    }

    public User getUser(Integer userId) {
        return iUser.findById(userId).get();
    }
}
