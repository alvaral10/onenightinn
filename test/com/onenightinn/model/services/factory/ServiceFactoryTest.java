package  com.onenightinn.model.services.factory;

import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.loginservice.LoginServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ServiceFactoryTest {


    ServiceFactory serviceFactory;

    @BeforeEach
    public void setUp() throws Exception {
        serviceFactory = new ServiceFactory();
    }


    /**
     * Test Factory to return the login service and assert it by
     * checking it is an instance of LoginServiceImpl
     * This should be true since LoginServiceImpl implements ILoginService
     */
    @Test
    public void testGetLoginService() {
        ILoginService loginService = serviceFactory.getLoginService();
        assertTrue(loginService instanceof LoginServiceImpl);
    }

}