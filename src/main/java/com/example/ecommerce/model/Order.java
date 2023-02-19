package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer OrderId;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User userID;
    @JoinColumn(name="product_id")
    @ManyToOne
    private Product productID;
    @JoinColumn(name = "address_id")
    @ManyToOne
    private Address addressID;
    @Column(name="product_quantity")
    private Integer productQuantity;

}
