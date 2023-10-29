package com.onenightinn.model.domain;

import java.io.Serial;
import java.io.Serializable;

public class Customer implements Serializable {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 7661657477853633935L;

    /** Customer last name */
    private String lastName;

    /** Customer first name */
    private String firstName;

    /** Customer email address */
    private String emailAddress;

    /** Customer password */
    private String password;

    /** Customer day phone */
    private String homePhone;

    /** Customer evening phone */
    private String workPhone;

    /** Customer address */
    private Address address;

    private Itinerary itinerary;

    /**
     * Copy Constructor
     *
     */
    public Customer(String lastName, String firstName, String emailAddress,
                    String password, String homePhone, String workPhone,
                    Address address, Itinerary itinerary) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
        this.address = address;
        this.itinerary = itinerary;
    }

    /**
     * @param lastName
     * @param firstName
     * @param emailAddress
     */
    public Customer(String lastName, String firstName, String emailAddress,
                    String password, String dayTimePhone, String eveningTimePhone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.homePhone = homePhone;
        this.workPhone = workPhone;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     *            the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     *            the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress
     *            the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the homePhone
     */
    public String gethomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone
     *            the dayTimePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the eveningTimePhone
     */
    public String getworkPhone() {
        return workPhone;
    }

    /**
     * @param workPhone
     *            the workPhone to set
     */
    public void setworkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public boolean validate() {
        if (lastName == null)
            return false;
        if (firstName == null)
            return false;
        if (emailAddress == null)
            return false;
        if (password == null)
            return false;
        if (homePhone == null)
            return false;
        if (workPhone == null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result
                + ((homePhone == null) ? 0 : homePhone.hashCode());
        result = prime * result
                + ((emailAddress == null) ? 0 : emailAddress.hashCode());
        result = prime
                * result
                + ((workPhone == null) ? 0 : workPhone.hashCode());
        result = prime * result
                + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result
                + ((itinerary == null) ? 0 : itinerary.hashCode());
        result = prime * result
                + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result
                + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (homePhone == null) {
            if (other.homePhone != null)
                return false;
        } else if (!homePhone.equals(other.homePhone))
            return false;
        if (emailAddress == null) {
            if (other.emailAddress != null)
                return false;
        } else if (!emailAddress.equals(other.emailAddress))
            return false;
        if (workPhone == null) {
            if (other.workPhone!= null)
                return false;
        } else if (!workPhone.equals(other.workPhone))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (itinerary == null) {
            if (other.itinerary != null)
                return false;
        } else if (!itinerary.equals(other.itinerary))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Customer [lastName=" + lastName + ", firstName=" + firstName
                + ", emailAddress=" + emailAddress + ", password=" + password
                + ", dayTimePhone=" + homePhone + ", eveningTimePhone="
                + workPhone + ", address=" + address + ", itinerary="
                + itinerary + "]";
    }

    public static void main(String[] args){

        Address address = new Address();
        address.setAddress("123 Main St");
        address.setCity("SpringField");
        address.setState("OH");
        address.setZip("1224");

        Itinerary itinerary = new Itinerary("aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa");

        Customer cust = new Customer ("Kitty", "Hello", "hk@sanio.com", "1234", "222", "111", address, itinerary );

        System.out.println (cust);
    }
}
