package com.onenightinn.model.services.customerservice;

import com.onenightinn.model.domain.Customer;

public interface ICustomerService {
    boolean createCustomer(Customer customer);
    boolean getCustomer(String firstName, String lastName);
    boolean updateCustomer(String firstName, String lastName, Customer updateCustomer);
    boolean deleteCustomer(String firstName, String lastName);
}
