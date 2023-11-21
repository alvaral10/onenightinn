package com.onenightinn.model.services.registrationservice;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.domain.ReservationComposite;
import com.onenightinn.model.services.exception.RegistrationException;
import com.onenightinn.model.services.factory.ServiceFactory;
import com.onenightinn.model.services.manager.PropertyManager;
import junit.framework.TestCase;

public class RegistrationServiceImplTest extends TestCase {

    private ReservationComposite reservationComposite;
    private Customer customer;
    private IRegistrationService registrationService;
    private ServiceFactory serviceFactory;

    @Override
    public void setUp() throws Exception {


        String propertyFileLocation = System.getProperty("prop_location");

        PropertyManager.loadProperties(propertyFileLocation);

        serviceFactory = ServiceFactory.getInstance();

        customer = new Customer("Griffin", "Stewie", "family@guy.com", "brian",
                "706.111.1234", "860.111.1234");
        reservationComposite = new ReservationComposite();
        reservationComposite.setCustomer(customer);

        new RegistrationServiceImpl();

        // initialize registrationService
        try {
            registrationService = (IRegistrationService) serviceFactory
                    .getService("IRegistrationService");
        } catch ( ServiceLoadException e ) {
            e.printStackTrace();
            fail("Should not see ServiceLoadException");
        }
    }


    public final void testRegisterCustomer() {

        try {
            boolean isRegistered = registrationService
                    .registerCustomer(new ReservationComposite());
            assertTrue(isRegistered);
        } catch ( RegistrationException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public final void testRegisterCustomerUnSuccessful() {

        try {
            ReservationComposite reservationComposite = new ReservationComposite();
            boolean isRegistered = registrationService.registerCustomer(reservationComposite);
            assertFalse(isRegistered);
        } catch ( RegistrationException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}