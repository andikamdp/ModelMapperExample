package com.Andika_Training.demo.utils;

import org.modelmapper.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static final String yyyyMMdd = "yyyyMMdd";
    public static final String yyyydMMddd = "yyyy-MM-dd";
    public static final String yyyyuMMudd = "yyyy_MM_dd";

    public static String dateToStringFormat(Date date, String dateFormat) {
        return new SimpleDateFormat(dateFormat).format(date);
    }

    public static Date dateToStringFormat(String stringDate, String dateFormat) throws ParseException {
        return new SimpleDateFormat(dateFormat).parse(stringDate);
    }

    public static Converter<Date, String> converterDateToString()  {
        Converter<Date, String> formatDate = ctx -> ctx.getSource() != null
                ? Utils.dateToStringFormat(ctx.getSource(),Utils.yyyydMMddd)
                : "";
        return formatDate;
    }
}
