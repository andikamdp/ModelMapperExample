package com.Andika_Training.demo.sample1;

import org.modelmapper.ModelMapper;

public class MappingSample1 {

    private static Order getOrderdata(){
        Address address = new Address();
        address.setCity("Bandung");
        address.setProvince("Jawa Barat");

        Name name = new Name();
        name.setFirstName("Pemuja");
        name.setLastName("Rahasia");

        Customer customer = new Customer();
        customer.setName(name);

        Order order = new Order();
        order.setAddress(address);
        order.setCustomer(customer);

        return order;
    }


    public void convertSample1_1(){
        Order order = this.getOrderdata();
        ModelMapper modelMapper = new ModelMapper();
        OrderDto orderDTO = modelMapper.map(order, OrderDto.class);
    }
}
