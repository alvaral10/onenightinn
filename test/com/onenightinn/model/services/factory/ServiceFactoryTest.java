package  com.onenightinn.model.services.factory;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.loginservice.LoginServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ServiceFactoryTest {

    ServiceFactory serviceFactory;
    Customer customer;

    @Before
    public void setUp(){
        serviceFactory = ServiceFactory.getInstance();
        customer = new Customer("Stewie", "Griffin", "family@guy.com", "brian", "706.11.2468", "860.11.1357");
    }

    @Test
    public void testGetLoginService() {
        ILoginService loginService;
        try {
            loginService = (ILoginService)serviceFactory.getService(ILoginService.NAME);
            assertTrue(loginService instanceof LoginServiceImpl);
            System.out.println("testGetLoginService PASSED");
        } catch (ServiceLoadException e) {
            e.printStackTrace();
            fail("ServiceLoadException");
        }
    }

}