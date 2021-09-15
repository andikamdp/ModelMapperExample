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

    public static Date dateToStringFormat(String stringDate, String dateFormat) throws ParseException {
        return new SimpleDateFormat(dateFormat).parse(stringDate);
    }

    public static Converter<Date, String> converterDateToString() {
        return ctx -> ctx.getSource() != null
                ? Utils.dateToStringFormat(ctx.getSource(), Utils.YYYY_D_MM_D_DD)
                : "";
    }
}
