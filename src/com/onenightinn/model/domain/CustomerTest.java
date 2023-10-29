package com.onenightinn.model.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    private Customer customer;

    @BeforeEach
    void setUp() {
        /*
         Create a new Customer object before each test
         */
        customer = new Customer("Kitty", "Hello", "hk@sanio.com", "password", "1234567890", "9876543210", null, null);
    }

    @Test
    void testValidateValidCustomer() {
        assertTrue(customer.validate());
    }

    @Test
    void testValidateInvalidCustomer() {
        // Set one of the required fields to null
        customer.setLastName(null);
        assertFalse(customer.validate());
    }

    // Add more test methods to cover other scenarios

}
