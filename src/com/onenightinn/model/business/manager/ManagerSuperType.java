package com.onenightinn.model.business.manager;

import com.onenightinn.model.business.exception.PropertyFileNotFoundException;
import com.onenightinn.model.domain.ReservationComposite;
import com.onenightinn.model.services.manager.PropertyManager;

public abstract class ManagerSuperType {
    static
    {
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

    public abstract boolean performAction(String commandString, ReservationComposite reservationComposite);

    public static void loadProperties () throws PropertyFileNotFoundException
    {

        String propertyFileLocation = System.getProperty("prop_location");

        if (propertyFileLocation != null)
        {
            // Now that we have the property file location, lets have the
            // PropertyManager class load it up
            PropertyManager.loadProperties(propertyFileLocation);
        }
        else
        {
            System.out.println("Property file location not set. Passed in value is: " + propertyFileLocation + ".");
            throw new PropertyFileNotFoundException ("Property file location not set", null);
        }


    } //end loadProperties
}
