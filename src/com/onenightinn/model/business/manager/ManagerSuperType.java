package com.onenightinn.model.business.manager;

import com.onenightinn.model.business.exception.PropertyFileNotFoundException;
import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.services.manager.PropertyManager;

public abstract class ManagerSuperType {
    static {
        try
        {
            ManagerSuperType.loadProperties();
        }
        catch (PropertyFileNotFoundException propertyFileNotFoundException)
        {
            System.out.println ("Application Properties failed to be loaded - Application exiting...");
            System.exit(1);
        }
    }

    public abstract boolean performAction(String commandString, Composite composite);

    public static void loadProperties () throws PropertyFileNotFoundException {

        System.out.println("---->Inside ManagerSuperType::loadProperties");
        String propertyFileLocation = "config\\application.properties";
        PropertyManager.loadProperties(propertyFileLocation);

    } //end loadProperties
}
