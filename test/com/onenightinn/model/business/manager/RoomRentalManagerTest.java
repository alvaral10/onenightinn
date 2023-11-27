package com.onenightinn.model.business.manager;

import junit.framework.TestCase;

import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.registrationservice.IRegistrationService;

public class RoomRentalManagerTest extends TestCase {

    private RoomRentalManager roomRentalManager;
    private Composite composite;
    private Customer customer;


    protected void setUp() throws Exception {
        super.setUp();


        roomRentalManager = RoomRentalManager.getInstance();

        customer = new Customer ("Griffin", "Stewie", "family@guy.com", "brian", "706.111.1234","860.111.1234");
        composite = new Composite();
        composite.setCustomer(customer);
    }


    /**
     * Test performAction method for RegisterCustomer
     */
    public final void testPerformActionOnRegisterCustomer()
    {
        boolean action = roomRentalManager.performAction("RegisterCustomer", composite);
        assertTrue(action);
    }

    /**
     * Test performAction method for LoginCustomer
     */
    public final void testPerformActionOnLoginCustomer()
    {
        boolean action = roomRentalManager.performAction("LoginCustomer", composite);
        assertTrue(action);
    }

    /**
     * Test register customer
     *
     */
    public final void testRegisterCustomer() {
        boolean isRegistered = roomRentalManager.registerCustomer(IRegistrationService.NAME, composite);
        assertTrue(isRegistered);
    }

    /**
     * Test login customer
     */
    public final void testLoginCustomer() {
        boolean isLoggedIn = roomRentalManager.loginCustomer(ILoginService.NAME, composite);
        assertTrue(isLoggedIn);
    }
}