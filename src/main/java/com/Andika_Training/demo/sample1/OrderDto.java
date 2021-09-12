package com.Andika_Training.demo.sample1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderDto {
    String customerFirstName;
    String customerLastName;
    String billingCity;
    String billingProvince;
}
