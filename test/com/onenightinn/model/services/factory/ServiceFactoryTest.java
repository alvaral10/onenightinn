package  com.onenightinn.model.services.factory;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.loginservice.LoginServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServiceFactoryTest {


    ServiceFactory serviceFactory;

    @BeforeEach
    public void setUp() throws Exception {
        serviceFactory = ServiceFactory.getInstance();
    }


    /**
     * Test Factory to return the login service and assert it by
     * checking it is an instance of LoginServiceImpl
     * This should be true since LoginServiceImpl implements ILoginService
     */
    @Test
    public void testGetLoginService() {
        ILoginService loginService;
        try {
            loginService = (ILoginService) serviceFactory.getService(ILoginService.NAME);
            Assertions.assertTrue(loginService instanceof LoginServiceImpl);
            System.out.println("testGetLoginService PASSED");
        } catch (ServiceLoadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assertions.fail("ServiceLoadException");
        }

    }

}