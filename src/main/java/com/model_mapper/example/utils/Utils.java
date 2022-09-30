package com.model_mapper.example.utils;

import org.modelmapper.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    private Utils() {
    }

    public static final String YYYYMMDD = "yyyyMMdd";
    public static final String YYYY_D_MM_D_DD = "yyyy-MM-dd";
    public static final String YYYYUMMUDD = "yyyy_MM_dd";

    public static String dateToStringFormat(Date date, String dateFormat) {
        return new SimpleDateFormat(dateFormat).format(date);
    }

    public static Date stringToDateFormat(String stringDate, String dateFormat) throws ParseException {
        return new SimpleDateFormat(dateFormat).parse(stringDate);
    }

    public static String clearString(String data){
        if(data==null || data.isEmpty())
            return data;
        return data.replaceAll("[^a-zA-Z0-9 .,\\-]", "");
    }
}
