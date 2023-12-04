package com.onenightinn.model.services.factory;

import com.onenightinn.model.business.exception.ServiceLoadException;
import com.onenightinn.model.services.IService;

import java.io.IOException;

public class ServiceFactory {

    private ServiceFactory() {
    }

    private static ServiceFactory serviceFactoryInstance;
    public static ServiceFactory getInstance()
    {
        if (serviceFactoryInstance == null)
            serviceFactoryInstance = new ServiceFactory();
        return serviceFactoryInstance;
    }

    public IService getService(String serviceName) throws ServiceLoadException
    {
        try
        {
            Class<?> c = Class.forName(getImplName(serviceName));
            return (IService)c.newInstance();
        } catch (Exception excp)
        {
            serviceName = serviceName + " not loaded";
            throw new ServiceLoadException(serviceName, excp);
        }
    }

    private String getImplName (String serviceName) throws IOException {
        java.util.Properties props = new java.util.Properties();

        String propertyFileLocation = "config/application.properties";

        System.out.println("Property File Location passed : " + propertyFileLocation);
        java.io.FileInputStream fis = new java.io.FileInputStream(propertyFileLocation);

        props.load(fis);
        fis.close();
        return props.getProperty(serviceName);
    }
}