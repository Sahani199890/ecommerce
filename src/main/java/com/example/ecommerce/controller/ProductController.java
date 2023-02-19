package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ecommerce-product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("/add-product")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return new ResponseEntity<>("product added successfully", HttpStatus.CREATED);
    }
    @GetMapping("/get-all-products")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @DeleteMapping("/delete-product")
    public ResponseEntity<String> deleteProduct(@RequestParam Integer productId){
        productService.deleteProduct(productId);
        return new ResponseEntity<>("Product Deleted successfully",HttpStatus.ACCEPTED);
    }

}
