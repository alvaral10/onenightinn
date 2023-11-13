package com.onenightinn.model.services.loginservice;


import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.domain.ReservationComposite;
import com.onenightinn.model.services.factory.ServiceFactory;
import junit.framework.TestCase;

public  class LoginServiceImplTest extends TestCase {

    private ServiceFactory serviceFactory;
    private Customer customer;
    private ReservationComposite reservationComposite = new ReservationComposite();

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        serviceFactory = ServiceFactory.getInstance();

        customer = new Customer("Stewie", "Griffin", "family@guy.com", "brian", "246.846.1234", "135.795.2468");

        reservationComposite.setCustomer(customer);
    }

    public final void testAuthenticateCustomer() {

        ILoginService loginService;
        try {
            loginService = (ILoginService) serviceFactory
                    .getService(ILoginService.NAME);
            assertTrue(loginService.authenticateCustomer(reservationComposite.getCustomer()));
            System.out.println("testAuthenticateCustomer PASSED");
        } catch (ServiceLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("ServiceLoadException");
        }

        try {
            LoginServiceImpl loginServiceImpl = (LoginServiceImpl) serviceFactory
                    .getService(ILoginService.NAME);
            assertTrue(loginServiceImpl.authenticateCustomer(reservationComposite.getCustomer()));
            System.out.println("testAuthenticateCustomer PASSED");
        } catch (ServiceLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("ServiceLoadException");
        }
    }
    }