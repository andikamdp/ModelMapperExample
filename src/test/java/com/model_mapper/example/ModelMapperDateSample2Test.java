package com.model_mapper.example;


import com.model_mapper.example.model.domain.Order;
import com.model_mapper.example.model.dto.OrderDto;
import com.model_mapper.example.model.mapper.OrderMapper;
import com.model_mapper.example.utils.Utils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class ModelMapperDateSample2Test {


    @Test
    void MappingSample2FirstName() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare FirstName :", order.getCustomer().getName().getFirstName(), orderDto.getCustomerFirstName());
    }

    @Test
    void MappingSample2LastName() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare LastName :", order.getCustomer().getName().getLastName(), orderDto.getCustomerLastName());
    }

    @Test
    void MappingSample2BirthDate() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare LastName :", order.getCustomer().getBirthDate(), orderDto.getCustomerBirthDate());
    }

    @Test
    void MappingSample2Age() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare LastName :", order.getCustomer().getAge(), orderDto.getCustomerAge());
    }

    @Test
    void MappingSample2Province() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare Province :", order.getBillingAddress().getProvince(), orderDto.getAddressProvince());
    }

    @Test
    void MappingSample2City() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare City :", order.getBillingAddress().getCity(), orderDto.getAddressCity());
    }

    @Test
    void MappingSample2StreetNo() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare Street No :", order.getBillingAddress().getStreetNo(), orderDto.getAddressStreetNo());
    }

    @Test
    void MappingSample2OrderDate() {
        Order order = SampleData.getSampleOrderData2();
        OrderDto orderDto = OrderMapper.getMapper().dateMapper(order);
        assertEquals("Compare OrderDate :", Utils.dateToStringFormat(order.getOrderDate(), Utils.yyyydmmddd), orderDto.getDate());
    }

}
