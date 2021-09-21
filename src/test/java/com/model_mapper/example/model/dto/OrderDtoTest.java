package com.model_mapper.example.model.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OrderDtoTest {
    @Test
    void testCanEqual() {
        assertFalse((new OrderDto()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        OrderDto orderDto = new OrderDto();

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(0);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(0);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertTrue(orderDto.canEqual(orderDto1));
    }

    @Test
    void testConstructor() {
        OrderDto actualOrderDto = new OrderDto();
        actualOrderDto.setAddressCity("42 Main St");
        actualOrderDto.setAddressProvince("42 Main St");
        actualOrderDto.setAddressStreetNo(1);
        actualOrderDto.setCustomerAge(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant());
        actualOrderDto.setCustomerBirthDate(fromResult);
        actualOrderDto.setCustomerFirstName("Jane");
        actualOrderDto.setCustomerLastName("Doe");
        actualOrderDto.setDate("2020-03-01");
        assertEquals("42 Main St", actualOrderDto.getAddressCity());
        assertEquals("42 Main St", actualOrderDto.getAddressProvince());
        assertEquals(1, actualOrderDto.getAddressStreetNo().intValue());
        assertEquals(1, actualOrderDto.getCustomerAge());
        assertSame(fromResult, actualOrderDto.getCustomerBirthDate());
        assertEquals("Jane", actualOrderDto.getCustomerFirstName());
        assertEquals("Doe", actualOrderDto.getCustomerLastName());
        assertEquals("2020-03-01", actualOrderDto.getDate());
        assertEquals("OrderDto(customerFirstName=Jane, customerLastName=Doe, customerAge=1, customerBirthDate=Thu Jan 01"
                + " 00:00:00 ICT 1970, addressCity=42 Main St, addressProvince=42 Main St, addressStreetNo=1,"
                + " date=2020-03-01)", actualOrderDto.toString());
    }

    @Test
    void testEquals() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");
        assertNotEquals(orderDto, null);
    }

    @Test
    void testEquals10() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Jane");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals11() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName(null);
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals12() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(0);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals13() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(null);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals14() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(0, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals15() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        orderDto.setCustomerBirthDate(null);
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals16() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("Jane");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals17() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince(null);
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals18() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020/03/01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals19() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate(null);

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals2() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");
        assertNotEquals(orderDto, "Different type to OrderDto");
    }

    @Test
    void testEquals3() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");
        assertEquals(orderDto, orderDto);
        int expectedHashCodeResult = orderDto.hashCode();
        assertEquals(expectedHashCodeResult, orderDto.hashCode());
    }

    @Test
    void testEquals4() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertEquals(orderDto1, orderDto);
        int expectedHashCodeResult = orderDto.hashCode();
        assertEquals(expectedHashCodeResult, orderDto1.hashCode());
    }

    @Test
    void testEquals5() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(0);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals6() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("Jane");
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals7() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity(null);
        orderDto.setCustomerFirstName("Jane");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals8() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName(null);
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }

    @Test
    void testEquals9() {
        OrderDto orderDto = new OrderDto();
        orderDto.setCustomerAge(1);
        orderDto.setAddressCity("42 Main St");
        orderDto.setCustomerFirstName("Doe");
        orderDto.setCustomerLastName("Doe");
        orderDto.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto.setCustomerBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto.setAddressProvince("42 Main St");
        orderDto.setDate("2020-03-01");

        OrderDto orderDto1 = new OrderDto();
        orderDto1.setCustomerAge(1);
        orderDto1.setAddressCity("42 Main St");
        orderDto1.setCustomerFirstName("Jane");
        orderDto1.setCustomerLastName("Doe");
        orderDto1.setAddressStreetNo(1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        orderDto1.setCustomerBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        orderDto1.setAddressProvince("42 Main St");
        orderDto1.setDate("2020-03-01");
        assertNotEquals(orderDto1, orderDto);
    }
}

