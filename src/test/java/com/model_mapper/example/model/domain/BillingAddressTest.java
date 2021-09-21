package com.model_mapper.example.model.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingAddressTest {
    @Test
    void testCanEqual() {
        assertFalse((new BillingAddress()).canEqual("Other"));
    }

    @Test
    void testCanEqual2() {
        BillingAddress billingAddress = new BillingAddress();

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(0);
        billingAddress1.setProvince("Province");
        assertTrue(billingAddress.canEqual(billingAddress1));
    }

    @Test
    void testConstructor() {
        BillingAddress actualBillingAddress = new BillingAddress();
        actualBillingAddress.setCity("Oxford");
        actualBillingAddress.setProvince("Province");
        actualBillingAddress.setStreetNo(1);
        assertEquals("Oxford", actualBillingAddress.getCity());
        assertEquals("Province", actualBillingAddress.getProvince());
        assertEquals(1, actualBillingAddress.getStreetNo().intValue());
        assertEquals("BillingAddress(city=Oxford, province=Province, streetNo=1)", actualBillingAddress.toString());
    }

    @Test
    void testEquals() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");
        assertNotEquals(null, billingAddress);
    }

    @Test
    void testEquals10() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince(null);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertNotEquals(billingAddress, (billingAddress1));
    }

    @Test
    void testEquals11() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity(null);
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity(null);
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertEquals(billingAddress, (billingAddress1));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    void testEquals12() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(null);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(null);
        billingAddress1.setProvince("Province");
        assertEquals(billingAddress, (billingAddress1));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    void testEquals13() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince(null);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince(null);
        assertEquals(billingAddress, (billingAddress1));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    void testEquals2() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");
        assertNotEquals("Different type to BillingAddress",billingAddress);
    }

    @Test
    void testEquals3() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");
        assertEquals(billingAddress, billingAddress);
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress.hashCode());
    }

    @Test
    void testEquals4() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertEquals(billingAddress1, billingAddress);
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    void testEquals5() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity(null);
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertNotEquals(billingAddress1, billingAddress);
    }

    @Test
    void testEquals6() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Province");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertNotEquals(billingAddress1, billingAddress);
    }

    @Test
    void testEquals7() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(0);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertNotEquals(billingAddress1, billingAddress);
    }

    @Test
    void testEquals8() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(null);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertNotEquals(billingAddress1, billingAddress);
    }

    @Test
    void testEquals9() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Oxford");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertNotEquals(billingAddress1, billingAddress);
    }
}

