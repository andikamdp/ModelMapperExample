package com.model_mapper.example.model.config;

import com.model_mapper.example.model.mapper.OrderMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public OrderMapper initOrderMapper(){
        return new OrderMapper();
    }
}
