package com.onenightinn.model.services.registrationservice;

import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.services.IService;
import com.onenightinn.model.services.exception.RegistrationException;

public interface IRegistrationService extends IService
{

    public final String NAME = "IRegistrationService";

    /** Register customer into our application
     * @throws RegistrationException */
    public boolean registerCustomer(Composite composite) throws RegistrationException;
}
