package com.modelMapper.example.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class Order {
    Customer customer;
    BillingAddress billingAddress;
    Date orderDate;
}
