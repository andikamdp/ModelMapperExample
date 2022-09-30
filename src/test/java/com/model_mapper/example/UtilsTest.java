package com.model_mapper.example;

import com.model_mapper.example.model.domain.Order;
import com.model_mapper.example.model.dto.OrderDto;
import com.model_mapper.example.model.mapper.OrderMapper;
import com.model_mapper.example.utils.Utils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.Date;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
 class UtilsTest {

    @Test
    void initUtils() {
        Utils utils = null;

        assertEquals("utils test", utils, null);
    }

    @Test
    void stringToDate() throws ParseException {
        Date date = Utils.stringToDateFormat("20200101",Utils.YYYYMMDD );

        assertEquals("utils test", date, date);
    }

    @Test
    void dateToString() throws ParseException {
        Date date = Utils.stringToDateFormat("20200101",Utils.YYYYMMDD );

        String dateString = Utils.dateToStringFormat(date,Utils.YYYYMMDD );

        assertEquals("utils test", dateString, "20200101");
    }
}
