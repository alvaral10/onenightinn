package com.onenightinn.model.services.loginservice;

import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.IService;

public interface ILoginService extends IService {
    public final String NAME = "ILoginService";

    public boolean authenticateCustomer(Customer customer);
}