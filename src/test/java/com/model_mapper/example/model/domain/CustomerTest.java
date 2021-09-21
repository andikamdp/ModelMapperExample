package com.model_mapper.example.model.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testCanEqual() {
        assertFalse((new Customer()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        Customer customer = new Customer();

        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer1 = new Customer();
        customer1.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer1.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer1.setAge(0);
        assertTrue(customer.canEqual(customer1));
    }

    @Test
    void testConstructor() {
        Customer actualCustomer = new Customer();
        actualCustomer.setAge(1);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant());
        actualCustomer.setBirthDate(fromResult);
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");
        actualCustomer.setName(name);
        assertEquals(1, actualCustomer.getAge());
        assertSame(fromResult, actualCustomer.getBirthDate());
        assertSame(name, actualCustomer.getName());
        assertEquals("Customer(name=Name(firstName=Jane, lastName=Doe), birthDate=Thu Jan 01 00:00:00 ICT 1970, age=1)",
                actualCustomer.toString());
    }

    @Test
    void testEquals() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);
        assertNotEquals(null,customer);
    }

    @Test
    void testEquals2() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);
        assertNotEquals("Different type to Customer",customer);
    }

    @Test
    void testEquals3() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);
        assertEquals(customer, customer);
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer.hashCode());
    }

    @Test
    void testEquals4() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");

        Customer customer1 = new Customer();
        customer1.setName(name1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer1.setBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        customer1.setAge(1);
        assertEquals(customer1, customer);
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer1.hashCode());
    }
}

