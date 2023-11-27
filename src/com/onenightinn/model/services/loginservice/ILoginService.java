package com.onenightinn.model.services.loginservice;

import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.services.IService;
import com.onenightinn.model.services.exception.LoginException;


public interface ILoginService extends IService {
    public final String NAME = "ILoginService";

    public boolean authenticateCustomer(Composite composite) throws LoginException;
}