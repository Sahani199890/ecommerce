package com.example.ecommerce.service;

import com.example.ecommerce.dao.IProduct;
import com.example.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private IProduct iProduct;

    public void addProduct(Product product) {
        iProduct.save(product);
    }

    public List<Product> getAllProduct() {
        return iProduct.findAll();
    }

    public void deleteProduct(Integer productId) {
        iProduct.deleteById(productId);
    }
}

