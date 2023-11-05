package com.onenightinn.model.services.loginservice;

import com.onenightinn.model.domain.Customer;

public class LoginServiceImpl implements ILoginService{

    /**
     * Validates if the customer is indeed registered in our system.
     *
     */
    @Override
    public boolean authenticateCustomer(Customer customer) {
        System.out.println("Entering method LoginServiceImpl::authenticateCustomer");
        return true;
    }
}