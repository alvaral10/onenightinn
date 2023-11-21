package com.onenightinn.model.business.manager;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.domain.ReservationComposite;
import com.onenightinn.model.services.exception.LoginException;
import com.onenightinn.model.services.exception.RegistrationException;
import com.onenightinn.model.services.factory.ServiceFactory;
import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.registrationservice.IRegistrationService;

public class RoomRentalManager extends ManagerSuperType {

    private static RoomRentalManager _instance;

    /**
     * keep the constructor private to prevent instantiation by outside callers.
     */
    private RoomRentalManager() {
        // construct object . . .
    }
    public static synchronized RoomRentalManager getInstance() {
        if (_instance == null) {
            _instance = new RoomRentalManager();
        }
        return _instance;
    }

    @Override
    public boolean performAction(String commandString,
                                 ReservationComposite reservationComposite) {
        boolean action = false;
        if (commandString.equals("RegisterCustomer")) {
            action = registerCustomer(IRegistrationService.NAME,
                    reservationComposite);
        } else if (commandString.equals("LoginCustomer")) {
            action = loginCustomer(ILoginService.NAME, reservationComposite);
        }

        return action;
    }

    public boolean registerCustomer(String commandString,
                                    ReservationComposite reservationComposite) {
        boolean isRegistered = false;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        IRegistrationService iRegistrationService;

        try {
            iRegistrationService = (IRegistrationService) serviceFactory
                    .getService(commandString);
            isRegistered = iRegistrationService
                    .registerCustomer(reservationComposite);
        } catch (ServiceLoadException e1) {
            System.out.println("RoomRentalManager::registerCustomer failed"); // defaulting
            // to
            // isRegistered
            // to
            // false
        } catch ( RegistrationException e) {
            System.out.println("RoomRentalManager::registerCustomer failed"); // defaulting
            // to
            // isRegistered
            // to
            // false
        }

        return isRegistered;

    }// end registerCustomer

    public boolean loginCustomer(String commandString,
                                 ReservationComposite reservationComposite) {
        boolean isAuthenticated = false;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ILoginService iLoginService;

        try {
            iLoginService = (ILoginService) serviceFactory
                    .getService(commandString);
            isAuthenticated = iLoginService
                    .authenticateCustomer(reservationComposite);
        } catch (ServiceLoadException e1) {
            System.out.println("RoomRentalManager::login failed"); // defaulting
            // to
            // isAuthenticated
            // to false
        } catch (LoginException e) {
            System.out.println("RoomRentalManager::login failed"); // defaulting
            // to
            // isAuthenticated
            // to false
        }

        return isAuthenticated;
    } // end loginCustomer

    public static void main(String[] args) {

        RoomRentalManager roomRentalManager = RoomRentalManager
                .getInstance();

        Customer customer = new Customer("Griffin", "Stewi", "family@guy.com",
                "brian", "706.111.1234", "860.111.1234");
        ReservationComposite reservationComposite = new ReservationComposite();
        reservationComposite.setCustomer(customer);

        boolean isRegistered = roomRentalManager.performAction(
                "RegisterCustomer", reservationComposite);

        String message = isRegistered ? "RoomRentalManager::main - Successfully registered customer"
                : "RoomRentalManager::main - Failed to registered customer";
        System.out.println(message);

    } // end main
}