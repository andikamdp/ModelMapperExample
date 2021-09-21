//package com.model_mapper.example.utils;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.text.ParseException;
//import java.util.Date;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.internal.util.reflection.GenericMetadataSupport;
//import org.modelmapper.Converter;
//import org.modelmapper.internal.InheritingConfiguration;
//import org.modelmapper.internal.MappingContextImpl;
//import org.modelmapper.internal.MappingEngineImpl;
//
// class UtilsTest {
//    @Test
//     void testDateToStringFormat() throws ParseException {
//        // TODO: This test is incomplete.
//        //   Reason: No meaningful assertions found.
//        //   To help Diffblue Cover to find assertions, please add getters to the
//        //   class under test that return fields written by the method under test.
//        //   See https://diff.blue/R004
//
//        Utils.dateToStringFormat("2020-03-01", "2020-03-01");
//    }
//
//    @Test
//     void testConverterDateToString() {
//        Converter<Date, String> actualConverterDateToStringResult = Utils.converterDateToString();
//        Date source = new Date(1L);
//        Class<?> sourceType = Date.class;
//        Class<?> destinationType = String.class;
//        GenericMetadataSupport.TypeVarBoundedType genericDestinationType = new GenericMetadataSupport.TypeVarBoundedType(
//                null);
//        assertEquals("1970-01-01",
//                actualConverterDateToStringResult
//                        .convert(new MappingContextImpl<Date, String>(source, sourceType, "Destination", destinationType,
//                                genericDestinationType, "Type Map Name", new MappingEngineImpl(new InheritingConfiguration()))));
//    }
//}
//
