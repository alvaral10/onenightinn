package com.onenightinn.model.services.loginservice;


import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.factory.ServiceFactory;
import junit.framework.TestCase;

public  class LoginServiceImplTest extends TestCase {

    private ServiceFactory serviceFactory;
    private Customer customer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        serviceFactory = new ServiceFactory();

        customer = new Customer("Stewie", "Griffin", "family@guy.com", "brian", "246.846.1234", "135.795.2468");
    }

    public final void testAuthenticateCustomer() {

        ILoginService loginService = serviceFactory.getLoginService();
        assertTrue(loginService.authenticateCustomer(customer));
        System.out.println("testAuthenticateCustomer PASSED");

        LoginServiceImpl loginServiceImpl = (LoginServiceImpl) serviceFactory.getLoginService();
        assertTrue(loginServiceImpl.authenticateCustomer(customer));
        System.out.println("testAuthenticateCustomer PASSED");
    }
}