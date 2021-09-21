package com.model_mapper.example.model.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BillingAddressTest {
    @Test
    public void testCanEqual() {
        assertFalse((new BillingAddress()).canEqual("Other"));
    }

    @Test
    public void testCanEqual2() {
        BillingAddress billingAddress = new BillingAddress();

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(0);
        billingAddress1.setProvince("Province");
        assertTrue(billingAddress.canEqual(billingAddress1));
    }

    @Test
    public void testConstructor() {
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
    public void testEquals() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");
        assertFalse(billingAddress.equals(null));
    }

    @Test
    public void testEquals10() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince(null);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertFalse(billingAddress.equals(billingAddress1));
    }

    @Test
    public void testEquals11() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity(null);
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity(null);
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertTrue(billingAddress.equals(billingAddress1));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    public void testEquals12() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(null);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(null);
        billingAddress1.setProvince("Province");
        assertTrue(billingAddress.equals(billingAddress1));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    public void testEquals13() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince(null);

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince(null);
        assertTrue(billingAddress.equals(billingAddress1));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    public void testEquals2() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");
        assertFalse(billingAddress.equals("Different type to BillingAddress"));
    }

    @Test
    public void testEquals3() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");
        assertTrue(billingAddress.equals(billingAddress));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress.hashCode());
    }

    @Test
    public void testEquals4() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertTrue(billingAddress.equals(billingAddress1));
        int expectedHashCodeResult = billingAddress.hashCode();
        assertEquals(expectedHashCodeResult, billingAddress1.hashCode());
    }

    @Test
    public void testEquals5() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity(null);
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertFalse(billingAddress.equals(billingAddress1));
    }

    @Test
    public void testEquals6() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Province");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertFalse(billingAddress.equals(billingAddress1));
    }

    @Test
    public void testEquals7() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(0);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertFalse(billingAddress.equals(billingAddress1));
    }

    @Test
    public void testEquals8() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(null);
        billingAddress.setProvince("Province");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertFalse(billingAddress.equals(billingAddress1));
    }

    @Test
    public void testEquals9() {
        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setCity("Oxford");
        billingAddress.setStreetNo(1);
        billingAddress.setProvince("Oxford");

        BillingAddress billingAddress1 = new BillingAddress();
        billingAddress1.setCity("Oxford");
        billingAddress1.setStreetNo(1);
        billingAddress1.setProvince("Province");
        assertFalse(billingAddress.equals(billingAddress1));
    }
}

