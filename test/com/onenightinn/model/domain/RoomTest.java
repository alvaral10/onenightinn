package com.onenightinn.model.domain;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class RoomTest {

    @Test
    public void testValidate() {
        Room r1 = new Room(28.9f, "Homewood Suites", "King");
        assertTrue ("r1 validates", r1.validate());
        System.out.println("testValidate PASSED");
    }

    @Test
    public void testNotValidate() {
        Room r1 = new Room (28.9f, "Homewood Suites", "King");
        assertTrue ("r1 does not validate", r1.validate());
        System.out.println("testNotValidate PASSED");
    }

    @Test
    public void testEqualsCar() {
        System.out.println("starting testEqualsRoom()");
        Room r1 = new Room(28.9f, "Homewood Suites", "King");
        Room r2 = new Room(28.9f, "Homewood Suites", "King");
        assertTrue ("r1 equals r2", r1.equals(r2));
        System.out.println("testEqualsRoom PASSED");
    }

    @Test
    public void testNotEqualsCar() {
        System.out.println("starting testNotEqualsRoom()");
        Room r1 = new Room(28.9f, "Homewood Suites", "King");
        Room r2 =new Room(48.9f, "Homewood Suites", "Queen");
        assertFalse ("r1 does NOT equal r2", r1.equals(r2));
        System.out.println("testNotEqualsRoom PASSED");
    }
}
