package com.Andika_Training.demo;

import com.Andika_Training.demo.sample1.MappingSample1;
import com.Andika_Training.demo.sample1.Order;
import com.Andika_Training.demo.sample1.OrderDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class ModelMapperSample1Test {

    @Autowired
    MappingSample1 sample1;

    @Test
    void MappingSample1FirstName() {
        Order order = MappingSample1.getOrderdata();
        OrderDto orderDto = sample1.convertSample1();
        assertEquals("Compare FirstName :", order.getCustomer().getName().getFirstName(), orderDto.getCustomerFirstName());
    }

    @Test
    void MappingSample1LastName() {
        Order order = MappingSample1.getOrderdata();
        OrderDto orderDto = sample1.convertSample1();
        assertEquals("Compare LastName :", order.getCustomer().getName().getLastName(), orderDto.getCustomerLastName());
    }

    @Test
    void MappingSample1Province() {
        Order order = MappingSample1.getOrderdata();
        OrderDto orderDto = sample1.convertSample1();
        assertEquals("Compare Province :", order.getBillingAddress().getProvince(), orderDto.getAddressProvince());
    }

    @Test
    void MappingSample1City() {
        Order order = MappingSample1.getOrderdata();
        OrderDto orderDto = sample1.convertSample1();

        assertEquals("Compare City :", order.getBillingAddress().getCity(), orderDto.getAddressCity());
    }

}
