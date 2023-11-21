package com.onenightinn.model.services.loginservice;

import com.onenightinn.model.domain.ReservationComposite;
import com.onenightinn.model.services.IService;
import com.onenightinn.model.services.exception.LoginException;


public interface ILoginService extends IService {
    public final String NAME = "ILoginService";

    public boolean authenticateCustomer(ReservationComposite reservationComposite) throws LoginException;
}