package com.model_mapper.example.model.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.model_mapper.example.model.domain.BillingAddress;
import com.model_mapper.example.model.domain.Customer;
import com.model_mapper.example.model.domain.Name;
import com.model_mapper.example.model.domain.Order;
import com.model_mapper.example.model.dto.OrderDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

 class OrderMapperTest {

    private final OrderMapper orderMapper = new OrderMapper();
    @Test
     void testSimpleOrder() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant());
        order.setOrderDate(fromResult);
        OrderDto actualSimpleOrderResult = orderMapper.orderToOrderDto(order);
        assertEquals("Oxford", actualSimpleOrderResult.getAddressCity());
        assertEquals("Thu Jan 01 00:00:00 ICT 1970", actualSimpleOrderResult.getDate());
        assertEquals("Doe", actualSimpleOrderResult.getCustomerLastName());
        assertEquals("Jane", actualSimpleOrderResult.getCustomerFirstName());
        assertEquals(fromResult, actualSimpleOrderResult.getCustomerBirthDate());
        assertEquals(1, actualSimpleOrderResult.getCustomerAge());
        assertEquals("Province", actualSimpleOrderResult.getAddressProvince());
        assertEquals(1, actualSimpleOrderResult.getAddressStreetNo().intValue());
    }

    @Test
     void testSimpleOrder2() {
       
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant());
        order.setOrderDate(fromResult);
        OrderDto actualSimpleOrderResult = orderMapper.orderToOrderDto(order);
        assertEquals("Oxford", actualSimpleOrderResult.getAddressCity());
        assertEquals("Thu Jan 01 00:00:00 ICT 1970", actualSimpleOrderResult.getDate());
        assertEquals("Doe", actualSimpleOrderResult.getCustomerLastName());
        assertEquals("", actualSimpleOrderResult.getCustomerFirstName());
        assertEquals(fromResult, actualSimpleOrderResult.getCustomerBirthDate());
        assertEquals(1, actualSimpleOrderResult.getCustomerAge());
        assertEquals("Province", actualSimpleOrderResult.getAddressProvince());
        assertEquals(1, actualSimpleOrderResult.getAddressStreetNo().intValue());
    }

    @Test
     void testSimpleOrder3() {
        

        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        customer.setBirthDate(null);
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        OrderDto actualSimpleOrderResult = orderMapper.orderToOrderDto(order);
        assertEquals("Oxford", actualSimpleOrderResult.getAddressCity());
        assertEquals("Thu Jan 01 00:00:00 ICT 1970", actualSimpleOrderResult.getDate());
        assertEquals("Doe", actualSimpleOrderResult.getCustomerLastName());
        assertEquals("Jane", actualSimpleOrderResult.getCustomerFirstName());
        assertNull(actualSimpleOrderResult.getCustomerBirthDate());
        assertEquals(1, actualSimpleOrderResult.getCustomerAge());
        assertEquals(1, actualSimpleOrderResult.getAddressStreetNo().intValue());
        assertEquals("Province", actualSimpleOrderResult.getAddressProvince());
    }

    @Test
     void testSimpleOrder4() {
        

        Name name = new Name();
        name.setLastName("");
        name.setFirstName("");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant());
        order.setOrderDate(fromResult);
        OrderDto actualSimpleOrderResult = orderMapper.orderToOrderDto(order);
        assertEquals("Oxford", actualSimpleOrderResult.getAddressCity());
        assertEquals("Thu Jan 01 00:00:00 ICT 1970", actualSimpleOrderResult.getDate());
        assertEquals("", actualSimpleOrderResult.getCustomerLastName());
        assertEquals("", actualSimpleOrderResult.getCustomerFirstName());
        assertEquals(fromResult, actualSimpleOrderResult.getCustomerBirthDate());
        assertEquals(1, actualSimpleOrderResult.getCustomerAge());
        assertEquals("Province", actualSimpleOrderResult.getAddressProvince());
        assertEquals(1, actualSimpleOrderResult.getAddressStreetNo().intValue());
    }

    @Test
     void testDateMapper() {
        

        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant());
        order.setOrderDate(fromResult);
        OrderDto actualDateMapperResult = orderMapper.orderToOrderDto(order);
        assertEquals("Oxford", actualDateMapperResult.getAddressCity());
        assertEquals("1970-01-01", actualDateMapperResult.getDate());
        assertEquals("Doe", actualDateMapperResult.getCustomerLastName());
        assertEquals("Jane", actualDateMapperResult.getCustomerFirstName());
        assertEquals(fromResult, actualDateMapperResult.getCustomerBirthDate());
        assertEquals(1, actualDateMapperResult.getCustomerAge());
        assertEquals("Province", actualDateMapperResult.getAddressProvince());
        assertEquals(1, actualDateMapperResult.getAddressStreetNo().intValue());
    }

    @Test
     void testDateMapper2() {
        

        Name name = new Name();
        name.setLastName("yyyy-MM-dd");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant());
        order.setOrderDate(fromResult);
        OrderDto actualDateMapperResult = orderMapper.orderToOrderDto(order);
        assertEquals("Oxford", actualDateMapperResult.getAddressCity());
        assertEquals("1970-01-01", actualDateMapperResult.getDate());
        assertEquals("yyyy-MM-dd", actualDateMapperResult.getCustomerLastName());
        assertEquals("Jane", actualDateMapperResult.getCustomerFirstName());
        assertEquals(fromResult, actualDateMapperResult.getCustomerBirthDate());
        assertEquals(1, actualDateMapperResult.getCustomerAge());
        assertEquals("Province", actualDateMapperResult.getAddressProvince());
        assertEquals(1, actualDateMapperResult.getAddressStreetNo().intValue());
    }

    @Test
     void testConstructor() {
        // TODO: This test is incomplete.
        //   Reason: Nothing to assert: the constructed class does not have observers (e.g. getters or  fields).
        //   Add observers (e.g. getters or  fields) to the class.
        //   See https://diff.blue/R002

        new OrderMapper();
    }
}

