package com.onenightinn.model.domain;

import junit.framework.TestCase;

public class RoomsTest extends TestCase {
    public void testValidate() {
        Rooms r1 = new Rooms(50.5f, "Hilton", "King");
        assertTrue("c1 validates", r1.validate());
        System.out.println("testValidate PASSED");
    }
}
