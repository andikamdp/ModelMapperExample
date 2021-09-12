package com.Andika_Training.demo;


import com.Andika_Training.demo.sample1.MappingSample2;
import com.Andika_Training.demo.sample1.Order;
import com.Andika_Training.demo.sample1.OrderDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class ModelMapperSample2Test {

    @Autowired
    MappingSample2 sample2;

    @Test
    void MappingSample2FirstName() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();
        assertEquals("Compare FirstName :", order.getCustomer().getName().getFirstName(), orderDto.getCustomerFirstName());
    }

    @Test
    void MappingSample2LastName() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();
        assertEquals("Compare LastName :", order.getCustomer().getName().getLastName(), orderDto.getCustomerLastName());
    }

    @Test
    void MappingSample2BirthDate() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();
        assertEquals("Compare LastName :", order.getCustomer().getBirthDate(), orderDto.getCustomerBirthDate());
    }

    @Test
    void MappingSample2Age() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();
        assertEquals("Compare LastName :", order.getCustomer().getAge(), orderDto.getCustomerAge());
    }

    @Test
    void MappingSample2Province() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();
        assertEquals("Compare Province :", order.getBillingAddress().getProvince(), orderDto.getAddressProvince());
    }

    @Test
    void MappingSample2City() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();

        assertEquals("Compare City :", order.getBillingAddress().getCity(), orderDto.getAddressCity());
    }

    @Test
    void MappingSample2StreetNo() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();

        assertEquals("Compare Street No :", order.getBillingAddress().getStreetNo(), orderDto.getAddressStreetNo());
    }


    @Test
    void MappingSample2OrderDate() {
        Order order = MappingSample2.getOrderdata();
        OrderDto orderDto = sample2.convertSample2();

        assertEquals("Compare OrderDate :", order.getOrderDate(), orderDto.getDate());
    }

}
