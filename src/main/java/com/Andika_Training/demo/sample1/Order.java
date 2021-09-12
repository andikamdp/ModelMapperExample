package com.Andika_Training.demo.sample1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Order {
    Customer customer;
    Address address;
}
