package com.onenightinn.model.business.manager;

import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.registrationservice.IRegistrationService;
import junit.framework.TestCase;

public class RoomRentalManagerTest  extends TestCase {

    private RoomRentalManager roomRentalManager;
    private Composite composite;
    private Customer customer;


    protected void setUp() throws Exception {
        super.setUp();

        /*
         * Don't forget that FleetManager has a static block where it loads
         * the application.properties file, which means, we need to pass
         * location of the application.properties.
         *
         * If running in Eclipse, right-click on the unit test and navigate to
         *
         * 1. Run As -> Run Configuration
         * 2. Select Arguments Tab
         * 3. In VM Arguments section, add the -D property
         * 	  -Dprop_location=E:\FleetRental\config\application.properties
         *
         * If running on command line, you'd pass in the above -D option with the java command.
         *
         */

        roomRentalManager =RoomRentalManager.getInstance();

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
