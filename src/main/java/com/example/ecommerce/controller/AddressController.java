package com.example.ecommerce.controller;

import com.example.ecommerce.model.Address;
import com.example.ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ecommerce-address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/add-Address")
    public ResponseEntity<String> addAddress(@RequestBody Address address){
        addressService.addAddress(address);
        return new ResponseEntity<>("Address added successfully", HttpStatus.CREATED);
    }
}
