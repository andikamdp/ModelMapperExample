package com.model_mapper.example.model.mapper;

import com.model_mapper.example.model.domain.Order;
import com.model_mapper.example.model.dto.OrderDto;

public class OrderMapper extends MainMapper{

    public OrderDto orderToOrderDto(Order order) {
        return super.modelMapper.typeMap(Order.class, OrderDto.class).addMappings(mapper -> {
            mapper.map(src -> src.getBillingAddress().getProvince(),
                    OrderDto::setAddressProvince);
            mapper.map(src -> src.getBillingAddress().getCity(),
                    OrderDto::setAddressCity);
            mapper.using(super.converterDateToString()).map(Order::getOrderDate,
                    OrderDto::setDate);
        }).map(order);
    }
}
