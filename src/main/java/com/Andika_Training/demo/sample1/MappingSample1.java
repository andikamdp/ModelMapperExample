package com.Andika_Training.demo.sample1;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class MappingSample1 {

    public static Order getOrderdata(){
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


    public OrderDto convertSample1(){
        Order order = getOrderdata();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(order, OrderDto.class);

        OrderDto orderDTO = modelMapper.typeMap(Order.class, OrderDto.class).addMappings(mapper -> {
            mapper.map(src -> src.getBillingAddress().getProvince(),
                    OrderDto::setAddressProvince);
            mapper.map(src -> src.getBillingAddress().getCity(),
                    OrderDto::setAddressCity);
        }).map(order);

        return orderDTO;
    }
}
