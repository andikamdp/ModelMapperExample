package com.model_mapper.example.model.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    public void testCanEqual() {
        assertFalse((new Customer()).canEqual("Other"));
    }

    @Test
    public void testCanEqual2() {
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
    public void testConstructor() {
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
    public void testEquals() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);
        assertFalse(customer.equals(null));
    }

    @Test
    public void testEquals2() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);
        assertFalse(customer.equals("Different type to Customer"));
    }

    @Test
    public void testEquals3() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);
        assertTrue(customer.equals(customer));
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer.hashCode());
    }

    @Test
    public void testEquals4() {
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
        assertTrue(customer.equals(customer1));
        int expectedHashCodeResult = customer.hashCode();
        assertEquals(expectedHashCodeResult, customer1.hashCode());
    }
}
