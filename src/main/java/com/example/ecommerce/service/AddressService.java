package com.example.ecommerce.service;


import com.example.ecommerce.dao.IAddress;
import com.example.ecommerce.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    @Autowired
    private IAddress iAddress;

    public void addAddress(Address address) {
        iAddress.save(address);
    }
}
