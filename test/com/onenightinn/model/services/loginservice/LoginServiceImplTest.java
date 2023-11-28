package com.onenightinn.model.services.loginservice;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.exception.LoginException;
import com.onenightinn.model.services.factory.ServiceFactory;
import com.onenightinn.model.services.manager.PropertyManager;
import junit.framework.TestCase;

public class LoginServiceImplTest extends TestCase {

    private ServiceFactory serviceFactory;
    private Customer customer;
    private Composite composite;


    @Override
    protected void setUp() throws Exception {
        super.setUp();

        String propertyFileLocation = "config/application.properties";

        PropertyManager.loadProperties(propertyFileLocation);

        serviceFactory = ServiceFactory.getInstance();

        customer = new Customer ("Griffin", "Stewie", "family@guy.com", "brian", "706.111.1234","860.111.1234");

        composite = new Composite();
        composite.setCustomer(customer);
    }

    public final void testAuthenticateCustomer() {

        ILoginService loginService;
        try {
            loginService = (ILoginService) serviceFactory.getService(ILoginService.NAME);
            assertTrue(loginService.authenticateCustomer(composite));
        } catch (ServiceLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("ServiceLoadException");
        } catch (LoginException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("LoginException");

        }

        try {
            LoginServiceImpl loginServiceImpl = (LoginServiceImpl) serviceFactory.getService(ILoginService.NAME);
            assertTrue(loginServiceImpl.authenticateCustomer(composite));
        } catch (ServiceLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("ServiceLoadException");
        } catch (LoginException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail("LoginException");
        }
    }
}

