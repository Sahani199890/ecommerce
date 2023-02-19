package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address_table")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "address_name")
    private String addressName;
    @Column(name = "address_landmark")
    private String addressLandmark;
    @Column(name = "address_phonenumber")
    private String addressPhoneNumber;
    @Column(name = "address_zipcode")
    private Integer addressZipcode;
    @Column(name = "address_state")
    private String addressState;
    @JoinColumn(name = "user_id")
    @OneToOne
    private User userID;
}
