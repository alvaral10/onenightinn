package com.onenightinn.model.services.registrationservice;

import com.onenightinn.model.domain.Composite;
import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.exception.RegistrationException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RegistrationServiceImpl  implements IRegistrationService {

    public boolean registerCustomer(Composite composite) throws RegistrationException
    {
        boolean isRegisteredCustomer = true;
        ObjectOutputStream output = null;

        try {

            // If customer passed is not null, then write to file system.
            // else return false
            Customer customer = composite.getCustomer();

            if ( customer!= null)
            {
                // Question: Where do you suspect that this output file can be found?
                //
                // Note: How about passing the name and location of the out file via -D property as well?
                output = new ObjectOutputStream(new FileOutputStream("RegisteredCustomer.out"));
                output.writeObject(customer);
            }
            else
                isRegisteredCustomer = false;

        } catch (IOException ioEcxp)
        {
            System.out.println ("RegistrationServiceImpl::registerCustomer - Unable to Register customer");

            // Note: If determined that the Manager class can't really do much with this exception,
            //       then alternate to throwing this exception is to just log the error and return, in this
            //       case with a false.
            //
            throw new RegistrationException("Unable to register customer", ioEcxp);
        }
        finally
        {
            if (output != null)
            {
                try {
                    output.flush();
                    output.close();
                } catch ( IOException e) {
                    // Can't do much here if exceptions occur, other then logging
                    e.printStackTrace();
                }
            }
        }

        return isRegisteredCustomer;
    } //end RegisterCustomer
}
