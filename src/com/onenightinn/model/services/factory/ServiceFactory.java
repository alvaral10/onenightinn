package com.onenightinn.model.services.factory;

import com.onenightinn.model.services.loginservice.ILoginService;
import com.onenightinn.model.services.loginservice.LoginServiceImpl;

public class ServiceFactory {

    public ILoginService getLoginService(){

        return new LoginServiceImpl();
    }
}