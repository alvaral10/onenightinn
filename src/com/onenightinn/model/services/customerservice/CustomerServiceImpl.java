package com.onenightinn.model.services.customerservice;

import com.onenightinn.model.domain.Customer;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private final List<Customer> customers;

    public CustomerServiceImpl(List<Customer> customers) {
        this.customers = customers;
    }

    /**
     * Create a new customer
     *
     **/
    public boolean createCustomer(Customer customer) {
        customers.add(customer);
        return false;
    }

    @Override
    public boolean getCustomer(String firstName, String lastName) {
        return false;
    }

    /** Get customer by name **/
    public Customer getCustomerByName(String firstName, String lastName) {
        for (Customer customer : customers) {
            if (customer.getFirstName().equals(firstName) && customer.getLastName().equals(lastName)) {
                return customer;
            }
        }
        return null; // Customer not found
    }

    /**
     * Update customer
     *
     **/
    public boolean updateCustomer(String firstName, String lastName, Customer updatedCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer.getFirstName().equals(firstName) && customer.getLastName().equals(lastName)) {
                customers.set(i, updatedCustomer);
                return false;
            }
        }
        return false;
    }

    /**
     * Delete customer
     *
     **/
    public boolean deleteCustomer(String firstName, String lastName) {
        customers.removeIf(customer -> customer.getFirstName().equals(firstName) && customer.getLastName().equals(lastName));
        return false;
    }
}