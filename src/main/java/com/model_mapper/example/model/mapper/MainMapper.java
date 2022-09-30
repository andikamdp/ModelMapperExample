package com.model_mapper.example.model.mapper;

import com.model_mapper.example.model.domain.Order;
import com.model_mapper.example.model.dto.OrderDto;
import com.model_mapper.example.utils.Utils;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;

import java.text.ParseException;
import java.util.Date;

public class MainMapper {

    protected ModelMapper modelMapper = new ModelMapper();

    protected ModelMapper mapper() {
        return this.modelMapper;
    }

    protected Converter<Date, String> converterDateToString() {
        return ctx -> ctx.getSource() != null
                ? Utils.dateToStringFormat(ctx.getSource(), Utils.YYYY_D_MM_D_DD)
                : "";
    }

    protected Converter<String, Date> converterStringToDate() {
        return ctx -> {
            try {
               return ctx.getSource() != null
                        ? Utils.stringToDateFormat(ctx.getSource(), Utils.YYYY_D_MM_D_DD)
                        : null;
            } catch (ParseException e) {
                return null;
            }
        };
    }

    protected Converter<String, String> cleanString() {
        return ctx -> ctx.getSource() != null
                ? Utils.clearString(ctx.getSource())
                : "";
    }
}
