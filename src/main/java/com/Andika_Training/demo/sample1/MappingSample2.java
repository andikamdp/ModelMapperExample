package com.Andika_Training.demo.sample1;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MappingSample2 {

    public static Order getOrderdata(){
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


    public OrderDto convertSample2(){
        Order order = getOrderdata();
        ModelMapper modelMapper = new ModelMapper();
        OrderDto orderDTO = modelMapper.map(order, OrderDto.class);
        orderDTO = modelMapper.typeMap(Order.class, OrderDto.class).addMappings(mapper -> {
            mapper.map(src -> src.getBillingAddress().getProvince(),
                    OrderDto::setAddressProvince);
            mapper.map(src -> src.getBillingAddress().getCity(),
                    OrderDto::setAddressCity);
             Converter<Date, String> formatDate = ctx -> ctx.getSource() != null
                    ? formatDateToString(ctx.getSource())
                    : "";
            mapper.using(formatDate).map(src -> src.getOrderDate(),
                    OrderDto::setDate);
        }).map(order);

        return orderDTO;
    }


    public static String formatDateToString(Object v) {
        String dateFormat = "yyyy-MM-dd";
        String value = "";
        if(v!=null)
            value = new SimpleDateFormat(dateFormat).format(v);

        return value;
    }
}
