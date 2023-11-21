package com.onenightinn.model.services.registrationservice;

import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.domain.ReservationComposite;
import com.onenightinn.model.services.exception.RegistrationException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RegistrationServiceImpl implements IRegistrationService {


    public boolean registerCustomer(ReservationComposite reservationComposite) throws RegistrationException
    {
        boolean isRegisteredCustomer = true;
        ObjectOutputStream output = null;

        try {
            Customer customer = reservationComposite.getCustomer();

            if ( customer!= null)
            {
                output = new ObjectOutputStream (new FileOutputStream("RegisteredCustomer.out"));
                output.writeObject(customer);
            }
            else
                isRegisteredCustomer = false;

        } catch (IOException ioEcxp)
        {
            System.out.println ("RegistrationServiceImpl::registerCustomer - Unable to Register customer");
            throw new RegistrationException("Unable to register customer", ioEcxp);
        }
        finally
        {
            if (output != null)
            {
                try {
                    output.flush();
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return isRegisteredCustomer;
    }

}