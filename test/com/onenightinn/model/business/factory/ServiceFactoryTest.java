package com.onenightinn.model.business.factory;

import junit.framework.TestCase;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.services.factory.ServiceFactory;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.loginservice.LoginServiceImpl;
public class ServiceFactoryTest extends TestCase {

    ServiceFactory serviceFactory;


    public void setUp() throws Exception {
        serviceFactory = ServiceFactory.getInstance();
    }

    public void testGetInstance() {
        assertNotNull(serviceFactory);
    }

    public void testGetLoginService() {
        ILoginService loginService;
        try {
            loginService = (ILoginService)serviceFactory.getService(ILoginService.NAME);
            assertTrue(loginService instanceof LoginServiceImpl);
        } catch (ServiceLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}