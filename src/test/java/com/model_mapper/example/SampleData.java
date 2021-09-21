package com.model_mapper.example;

import com.model_mapper.example.model.domain.BillingAddress;
import com.model_mapper.example.model.domain.Customer;
import com.model_mapper.example.model.domain.Name;
import com.model_mapper.example.model.domain.Order;

import java.util.Date;

 class SampleData {
     static Order getSampleOrderData1() {
        BillingAddress address = new BillingAddress();
        address.setCity("Bandung");
        address.setProvince("Jawa Barat");

        Name name = new Name();
        name.setFirstName("Pemuja");
        name.setLastName("Rahasia");

        Customer customer = new Customer();
        customer.setName(name);

        Order order = new Order();
        order.setBillingAddress(address);
        order.setCustomer(customer);

        return order;
    }

     static Order getSampleOrderData2() {
        BillingAddress address = new BillingAddress();
        address.setCity("Semarang");
        address.setProvince("Jawa Tengah");
        address.setStreetNo(10);

        Name name = new Name();
        name.setFirstName("Jiman");
        name.setLastName("Wibisana");

        Customer customer = new Customer();
        customer.setName(name);
        customer.setAge(10);
        customer.setBirthDate(new Date());

        Order order = new Order();
        order.setBillingAddress(address);
        order.setCustomer(customer);
        order.setOrderDate(new Date());

        return order;
    }
}
