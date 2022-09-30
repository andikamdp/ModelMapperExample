package com.model_mapper.example;

import com.model_mapper.example.model.domain.Order;
import com.model_mapper.example.model.dto.OrderDto;
import com.model_mapper.example.model.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class ModelMapperSimpleSample1Test {

    private final OrderMapper orderMapper;

    @Autowired
    ModelMapperSimpleSample1Test(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Test
    void MappingSample1FirstName() {
        Order order = SampleData.getSampleOrderData1();
        OrderDto orderDto = orderMapper.orderToOrderDto(order);
        assertEquals("Compare FirstName :", order.getCustomer().getName().getFirstName(), orderDto.getCustomerFirstName());
    }

    @Test
    void MappingSample1LastName() {
        Order order = SampleData.getSampleOrderData1();
        OrderDto orderDto = orderMapper.orderToOrderDto(order);
        assertEquals("Compare LastName :", order.getCustomer().getName().getLastName(), orderDto.getCustomerLastName());
    }

    @Test
    void MappingSample1Province() {
        Order order = SampleData.getSampleOrderData1();
        OrderDto orderDto = orderMapper.orderToOrderDto(order);
        assertEquals("Compare Province :", order.getBillingAddress().getProvince(), orderDto.getAddressProvince());
    }

    @Test
    void MappingSample1City() {
        Order order = SampleData.getSampleOrderData1();
        OrderDto orderDto = orderMapper.orderToOrderDto(order);

        assertEquals("Compare City :", order.getBillingAddress().getCity(), orderDto.getAddressCity());
    }

}
