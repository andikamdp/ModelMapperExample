package com.Andika_Training.demo.model.mapper;

import com.Andika_Training.demo.model.domain.Order;
import com.Andika_Training.demo.model.dto.OrderDto;
import com.Andika_Training.demo.utils.Utils;
import org.modelmapper.ModelMapper;

public class OrderMapper {

    private static final OrderMapper orderMapper = new OrderMapper();

    public static OrderMapper getMapper() {
        return orderMapper;
    }

    public OrderDto simpleOrder(Order order) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(order, OrderDto.class);
    }

    public OrderDto dateMapper(Order order) {
        ModelMapper modelMapper = new ModelMapper();

        return modelMapper.typeMap(Order.class, OrderDto.class).addMappings(mapper -> {
            mapper.map(src -> src.getBillingAddress().getProvince(),
                    OrderDto::setAddressProvince);
            mapper.map(src -> src.getBillingAddress().getCity(),
                    OrderDto::setAddressCity);
            mapper.using(Utils.converterDateToString()).map(Order::getOrderDate,
                    OrderDto::setDate);
        }).map(order);
    }
}
