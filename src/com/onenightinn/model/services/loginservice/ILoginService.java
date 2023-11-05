package com.onenightinn.model.services.loginservice;


import com.onenightinn.model.domain.Customer;

public interface ILoginService {
    public boolean authenticateCustomer(Customer customer);
}