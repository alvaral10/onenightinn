package com.onenightinn.model.domain;

import java.io.Serial;
import java.io.Serializable;

public class ReservationComposite implements Serializable {


    /**
     *
     */
    @Serial
    private static final long serialVersionUID = -334371602256955290L;

    /** Holds information of the customer */
    private Customer customer;

    /** Holds the list of Cars available for rental */
    private AvailableRooms availableRooms;

    /** Customer's itinerary */
    private Itinerary itinerary;

    private Rooms rentedRooms;

    /**
     *
     */
    public ReservationComposite() {}


    /**
     * @return Returns the itinerary.
     */
    public Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * @param itinerary The itinerary to set.
     */
    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }
        /**
     * @return Returns the customer.
     */
    public Customer getCustomer() {
        return customer;
    }
    /**
     * @param customer The customer to set.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Rooms getRentedRooms(){
        return rentedRooms;
    }

    public void setRentedRooms(Rooms rooms){
        this.rentedRooms = rooms;
    }

    public String toString()
    {

        return "\nCustomer Info :\n" +
                customer +
                "\n\nAvailable Rentals :\n" +
                availableRooms +
                "\n\nItinerary :\n" +
                itinerary +
                "\n\nRented Rooms :\n" +
                rentedRooms;
    }
}
