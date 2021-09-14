package com.Andika_Training.demo;

import com.Andika_Training.demo.model.domain.BillingAddress;
import com.Andika_Training.demo.model.domain.Customer;
import com.Andika_Training.demo.model.domain.Name;
import com.Andika_Training.demo.model.domain.Order;

import java.util.Date;

public class SampleData {
    public static Order getSampleOrderData1(){
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

    public static Order getSampleOrderData2(){
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
