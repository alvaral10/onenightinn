package com.onenightinn.model.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CustomerTest {

    private Customer customer1, customer2;

    @Before
    public void setUp() throws Exception {

        customer1 = new Customer ("Griffin", "Stewie", "family@guy.com", "brian", "706.111.1234","860.111.1234");
        customer2 = new Customer ("Griffin", "Stewie", "family@guy.com", "brian", "706.111.1234","860.111.1234");

    }

    @Test
    public final void testValidateCustomer() {
        System.out.println("starting testValidateCustomer()");
        assertTrue ("customer validates", customer1.validate());
        System.out.println("testValidate PASSED");
    }

    @Test
    public final void testEqualsCustomer() {
        System.out.println("starting testEqualsCustomer()");
        // this should assert to true since the contents of
        // c1 and c2 class variables are identical.
        assertEquals("customer1 equals customer2", customer1, customer2);
        System.out.println("testEqualsCustomer PASSED");

    }
}
