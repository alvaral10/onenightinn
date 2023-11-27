package com.onenightinn.model.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CustomerTest {
    private Customer customer1;

    @BeforeEach
    void setUp() {
        /*
         Create a new Customer object before each test
         */
        customer1 = new Customer("Kitty", "Hello", "hk@sanio.com", "password");
    }

    @Test
    void testValidateValidCustomer() {
        System.out.println("starting testValidate Customer()");
        assertTrue(customer1.validate());
        System.out.println("testValidate PASSED");
    }

}
