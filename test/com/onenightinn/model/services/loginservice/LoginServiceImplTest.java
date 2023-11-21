package com.onenightinn.model.services.loginservice;


import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.domain.ReservationComposite;
import com.onenightinn.model.services.factory.ServiceFactory;
import com.onenightinn.model.services.manager.PropertyManager;
import com.onenightinn.model.services.exception.LoginException;

import junit.framework.TestCase;

public  class LoginServiceImplTest extends TestCase {

    private ServiceFactory serviceFactory;
    private Customer customer;
    private ReservationComposite reservationComposite = new ReservationComposite();

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        String propertyFileLocation = System.getProperty("prop_location");

        PropertyManager.loadProperties(propertyFileLocation);

        serviceFactory = ServiceFactory.getInstance();

        customer = new Customer("Stewie", "Griffin", "family@guy.com", "brian", "706.846.1234", "860.795.2468");

        reservationComposite.setCustomer(customer);
    }

    public final void testAuthenticateCustomer() {

        ILoginService loginService;
        try {
            loginService = (ILoginService) serviceFactory
                    .getService(ILoginService.NAME);
            assertTrue(loginService.authenticateCustomer(reservationComposite));
        } catch ( ServiceLoadException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("ServiceLoadException");
        } catch ( LoginException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            LoginServiceImpl loginServiceImpl = (LoginServiceImpl) serviceFactory
                    .getService(ILoginService.NAME);
            assertTrue(loginServiceImpl.authenticateCustomer(reservationComposite));
        } catch ( ServiceLoadException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("ServiceLoadException");
        } catch ( LoginException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("LoginException");
        }
    }
}