package com.example.ecommerce.controller;

import com.example.ecommerce.model.User;
import com.example.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ecommerce-user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add-user")
    public ResponseEntity<String> addUser(@RequestBody User user){
        userService.addUser(user);
        return new ResponseEntity<>("User Added Successfull", HttpStatus.CREATED);
    }
    @GetMapping("/get-user")
    public User getUser(@RequestParam Integer userId){
        return userService.getUser(userId);
    }

}
