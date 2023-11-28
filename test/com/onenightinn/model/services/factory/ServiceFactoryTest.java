package com.onenightinn.model.services.factory;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.loginservice.LoginServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ServiceFactoryTest {

    ServiceFactory serviceFactory;

    @Before
    public void setUp() throws Exception {
        serviceFactory = ServiceFactory.getInstance();
    }

    @Test
    public void testGetLoginService() {
        ILoginService loginService;
        try {
            loginService = (ILoginService)serviceFactory.getService(ILoginService.NAME);
            assertTrue(loginService instanceof LoginServiceImpl);
            System.out.println("testGetLoginService PASSED");
        } catch (ServiceLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }

}
