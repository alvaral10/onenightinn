package com.onenightinn.model.business.manager;

import com.onenightinn.model.business.exception.PropertyFileNotFoundException;
import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.services.manager.PropertyManager;

public abstract class ManagerSuperType {

    static
    {
        try
        {
            ManagerSuperType.loadProperties();
        }
        catch ( PropertyFileNotFoundException propertyFileNotFoundException)
        {
            System.out.println ("Application Properties failed to be loaded - Application exiting...");
            System.exit(1); // since we can't load the properties and this being crucial we'll exit the application!
        }
    }

    public abstract boolean performAction(String commandString, Composite composite);

    public static void loadProperties () throws PropertyFileNotFoundException {

        String propertyFileLocation = "config/application.properties";

        if (propertyFileLocation != null)
        {
            PropertyManager.loadProperties(propertyFileLocation);
        }
        else
        {
            System.out.println("Property file location not set. Passed in value is: " + propertyFileLocation + ".");
            throw new PropertyFileNotFoundException ("Property file location not set", null);
        }
    }

}
