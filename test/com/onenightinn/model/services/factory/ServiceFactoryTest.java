package  com.onenightinn.model.services.factory;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.loginservice.LoginServiceImpl;
import junit.framework.TestCase;

public class ServiceFactoryTest extends TestCase {


    ServiceFactory serviceFactory;

    public void setUp() throws Exception {
        serviceFactory = ServiceFactory.getInstance();
    }

    public void testGetInstance(){
        assertNotNull(serviceFactory);
    }
    public void testGetLoginService() {

        try {
            ILoginService loginService = (ILoginService)serviceFactory.getService(ILoginService.NAME);
            assertTrue(loginService instanceof LoginServiceImpl);
            System.out.println("testGetLoginService PASSED");
        } catch (ServiceLoadException e) {
            e.printStackTrace();
        }
    }

}