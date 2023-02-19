package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer productId;
    @Column(name = "Product-name")
    private String productName;
    @Column(name = "product_price")
    private Integer productPrice;
    @Column(name = "product_description")

    private String productDescription;
    @Column(name = "product_category")
    private String productCategory;
    @Column(name = "product_brand")
    private String productBrand;
}
