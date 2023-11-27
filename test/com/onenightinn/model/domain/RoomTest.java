package com.onenightinn.model.domain;

import junit.framework.TestCase;

public class RoomTest extends TestCase {
    public void testValidate() {
        Room r1 = new Room(50.5f, "Hilton", "King");
        assertTrue("c1 validates", r1.validate());
        System.out.println("testValidate PASSED");
    }
}
