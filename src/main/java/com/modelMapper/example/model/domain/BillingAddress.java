package com.modelMapper.example.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class BillingAddress {
    String city;
    String province;
    Integer streetNo;
}
