package com.onenightinn.model.services.loginservice;

import com.onenightinn.model.domain.Customer;
import com.onenightinn.model.services.exception.LoginException;
import com.onenightinn.model.domain.Composite;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoginServiceImpl implements ILoginService {

    public boolean authenticateCustomer(Composite composite) throws LoginException {

        boolean isValid = false;
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream("RegisteredCustomer.out"));
            Customer savedCustomer = (Customer) input.readObject();

            Customer inCustomer = composite.getCustomer();
            if (inCustomer != null) {
                if (savedCustomer.equals(inCustomer))
                    isValid = true;
                else
                    isValid = false;
            } else {
                throw new LoginException("Null Customer passed to LoginServiceImpl::login");
            }
        } catch ( FileNotFoundException fnfe ) {
            System.out.println("File containing registered users not found!");
            throw new LoginException("File containing registered users not found!", fnfe);
        } catch ( IOException ioe ) {
            System.out.println("IOException while accessing file containing registered users!");
            throw new LoginException("IOException while accessing file containing registered users!", ioe);
        } catch ( ClassNotFoundException cnfe ) {
            System.out.println("ClassNotFoundException while reading file containing registered users!");
            throw new LoginException("ClassNotFoundException while reading file containing registered users!", cnfe);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch ( IOException e ) {
                    e.printStackTrace();
                }
            }
        }//end try/catch/finally
        return isValid;
    } //end login
}
