package com.model_mapper.example.model.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

 class NameTest {
    @Test
     void testCanEqual() {
        assertFalse((new Name()).canEqual("Other"));
    }

    @Test
     void testCanEqual2() {
        Name name = new Name();

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");
        assertTrue(name.canEqual(name1));
    }

    @Test
     void testConstructor() {
        Name actualName = new Name();
        actualName.setFirstName("Jane");
        actualName.setLastName("Doe");
        assertEquals("Jane", actualName.getFirstName());
        assertEquals("Doe", actualName.getLastName());
        assertEquals("Name(firstName=Jane, lastName=Doe)", actualName.toString());
    }

    @Test
     void testEquals() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");
        assertFalse(name.equals(null));
    }

    @Test
     void testEquals10() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName(null);

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName(null);
        assertTrue(name.equals(name1));
        int expectedHashCodeResult = name.hashCode();
        assertEquals(expectedHashCodeResult, name1.hashCode());
    }

    @Test
     void testEquals2() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");
        assertFalse(name.equals("Different type to Name"));
    }

    @Test
     void testEquals3() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");
        assertTrue(name.equals(name));
        int expectedHashCodeResult = name.hashCode();
        assertEquals(expectedHashCodeResult, name.hashCode());
    }

    @Test
     void testEquals4() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Jane");

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");
        assertTrue(name.equals(name1));
        int expectedHashCodeResult = name.hashCode();
        assertEquals(expectedHashCodeResult, name1.hashCode());
    }

    @Test
     void testEquals5() {
        Name name = new Name();
        name.setLastName("Jane");
        name.setFirstName("Jane");

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");
        assertFalse(name.equals(name1));
    }

    @Test
     void testEquals6() {
        Name name = new Name();
        name.setLastName(null);
        name.setFirstName("Jane");

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");
        assertFalse(name.equals(name1));
    }

    @Test
     void testEquals7() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName(null);

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");
        assertFalse(name.equals(name1));
    }

    @Test
     void testEquals8() {
        Name name = new Name();
        name.setLastName("Doe");
        name.setFirstName("Doe");

        Name name1 = new Name();
        name1.setLastName("Doe");
        name1.setFirstName("Jane");
        assertFalse(name.equals(name1));
    }

    @Test
     void testEquals9() {
        Name name = new Name();
        name.setLastName(null);
        name.setFirstName("Jane");

        Name name1 = new Name();
        name1.setLastName(null);
        name1.setFirstName("Jane");
        assertTrue(name.equals(name1));
        int expectedHashCodeResult = name.hashCode();
        assertEquals(expectedHashCodeResult, name1.hashCode());
    }
}

