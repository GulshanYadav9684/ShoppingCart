package com.e_commerce.Shopping_Cart.model;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class OrderRequest {

    private String firstName;

    private String lastName;

    private String email;

    private String mobileNo;

    private String address;

    private String city;

    private String state;

    private String pincode;

    private String paymentType;

}