package com.modelMapper.example.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class Customer {
    Name name;
    Date birthDate;
    int age;
}
