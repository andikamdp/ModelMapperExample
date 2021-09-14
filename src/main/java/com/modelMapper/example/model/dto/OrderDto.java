package com.modelMapper.example.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class OrderDto {
    String customerFirstName;
    String customerLastName;
    int customerAge;
    Date customerBirthDate;
    String addressCity;
    String addressProvince;
    Integer addressStreetNo;
    String date;
}
