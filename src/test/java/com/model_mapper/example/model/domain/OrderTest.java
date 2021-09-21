package com.model_mapper.example.model.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void testCanEqual() {
        assertFalse((new Order()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        Order order = new Order();

        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(0);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(0);
        billingAddress.setProvince("Province");

        Order order1 = new Order();
        order1.setCustomer(customer);
        order1.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        assertTrue(order.canEqual(order1));
    }

    @Test
    void testConstructor() {
        Order actualOrder = new Order();
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");
        actualOrder.setBillingAddress(billingAddress);
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");
        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult = Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant());
        customer.setBirthDate(fromResult);
        customer.setAge(1);
        actualOrder.setCustomer(customer);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        Date fromResult1 = Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant());
        actualOrder.setOrderDate(fromResult1);
        assertSame(billingAddress, actualOrder.getBillingAddress());
        assertSame(customer, actualOrder.getCustomer());
        Date orderDate = actualOrder.getOrderDate();
        assertSame(fromResult1, orderDate);
        assertEquals(fromResult, orderDate);
        assertEquals("Order(customer=Customer(name=Name(firstName=Jane, lastName=Doe), birthDate=Thu Jan 01 00:00:00 ICT"
                + " 1970, age=1), billingAddress=BillingAddress(city=Oxford, province=Province, streetNo=1), orderDate=Thu"
                + " Jan 01 00:00:00 ICT 1970)", actualOrder.toString());
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

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        assertNotEquals(null,order);
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

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        assertNotEquals("Different type to Order",order);
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

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        assertEquals(order, order);
        int expectedHashCodeResult = order.hashCode();
        assertEquals(expectedHashCodeResult, order.hashCode());
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

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");

        Customer customer1 = new Customer();
        customer1.setName(name1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer1.setBirthDate(Date.from(atStartOfDayResult2.atZone(ZoneId.systemDefault()).toInstant()));
        customer1.setAge(1);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");

        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setBillingAddress(billingAddress1);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setOrderDate(Date.from(atStartOfDayResult3.atZone(ZoneId.systemDefault()).toInstant()));
        assertEquals(order1, order);
        int expectedHashCodeResult = order.hashCode();
        assertEquals(expectedHashCodeResult, order1.hashCode());
    }

    @Test
    void testEquals5() {
        Name name = new Name();
        name.setLastName("Jane");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");

        Customer customer1 = new Customer();
        customer1.setName(name1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer1.setBirthDate(Date.from(atStartOfDayResult2.atZone(ZoneId.systemDefault()).toInstant()));
        customer1.setAge(1);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");

        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setBillingAddress(billingAddress1);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setOrderDate(Date.from(atStartOfDayResult3.atZone(ZoneId.systemDefault()).toInstant()));
        assertNotEquals(order1, order);
    }

    @Test
    void testEquals6() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Jane");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");

        Customer customer1 = new Customer();
        customer1.setName(name1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer1.setBirthDate(Date.from(atStartOfDayResult2.atZone(ZoneId.systemDefault()).toInstant()));
        customer1.setAge(1);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");

        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setBillingAddress(billingAddress1);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setOrderDate(Date.from(atStartOfDayResult3.atZone(ZoneId.systemDefault()).toInstant()));
        assertNotEquals(order1, order);
    }

    @Test
    void testEquals7() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(0, 1, 1).atStartOfDay();
        order.setOrderDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");

        Customer customer1 = new Customer();
        customer1.setName(name1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer1.setBirthDate(Date.from(atStartOfDayResult2.atZone(ZoneId.systemDefault()).toInstant()));
        customer1.setAge(1);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");

        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setBillingAddress(billingAddress1);
        LocalDateTime atStartOfDayResult3 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setOrderDate(Date.from(atStartOfDayResult3.atZone(ZoneId.systemDefault()).toInstant()));
        assertNotEquals(order1, order);
    }

    @Test
    void testEquals8() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Customer customer = new Customer();
        customer.setName(name);
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer.setBirthDate(Date.from(atStartOfDayResult.atZone(ZoneId.systemDefault()).toInstant()));
        customer.setAge(1);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        Order order = new Order();
        order.setCustomer(customer);
        order.setBillingAddress(billingAddress);
        order.setOrderDate(null);

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");

        Customer customer1 = new Customer();
        customer1.setName(name1);
        LocalDateTime atStartOfDayResult1 = LocalDate.of(1970, 1, 1).atStartOfDay();
        customer1.setBirthDate(Date.from(atStartOfDayResult1.atZone(ZoneId.systemDefault()).toInstant()));
        customer1.setAge(1);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");

        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setBillingAddress(billingAddress1);
        LocalDateTime atStartOfDayResult2 = LocalDate.of(1970, 1, 1).atStartOfDay();
        order1.setOrderDate(Date.from(atStartOfDayResult2.atZone(ZoneId.systemDefault()).toInstant()));
        assertNotEquals(order1, order);
    }
}

