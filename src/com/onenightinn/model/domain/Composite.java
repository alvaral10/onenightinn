package com.onenightinn.model.domain;

import java.io.*;

public class Composite implements Serializable {


    /**
     *
     */
    @Serial
    private static final long serialVersionUID = -334371602256955290L;

    /** Holds information of the customer */
    private Customer customer;

    /** Holds the list of Cars available for rental */
    private AvailableRoom availableRoom;

    /** Customer's itinerary */
    private Itinerary itinerary;

    private Room room;

    /**
     *
     */
    public Composite() {}

    public AvailableRoom getAvailableRoom(){
        return availableRoom;
    }

    public void setAvailableRoom(AvailableRoom availableRoom){
        this.availableRoom = availableRoom;
    }
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

    public Room getRentedRoom(){
        return room;
    }

    public void setRentedRoom(Room room){
        this.room = room;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((availableRoom == null) ? 0 : availableRoom.hashCode());
        result = prime * result + ((customer == null) ? 0 : customer.hashCode());
        result = prime * result + ((room == null) ? 0 : room.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Composite other = (Composite) obj;
        if (availableRoom == null) {
            if (other.availableRoom != null)
                return false;
        } else if (!availableRoom.equals(other.availableRoom))
            return false;
        if (customer == null) {
            if (other.customer != null)
                return false;
        } else if (!customer.equals(other.customer))
            return false;
        if (room == null) {
            if (other.room != null)
                return false;
        } else if (!room.equals(other.room))
            return false;
        return true;
    }

    public String toString()
    {

        return "\nCustomer Info :\n" +
                customer +
                "\n\nAvailable Rentals :\n" +
                availableRoom +
                "\n\nItinerary :\n" +
                itinerary +
                "\n\nRented Rooms :\n" +
                room;
    }

    public static void main(String[] args){
        Room myRoom = new Room(100.00f, "Hilton", "King");
        System.out.println(myRoom);

        try (OutputStream file = new FileOutputStream("Room.out");
             OutputStream buffer = new BufferedOutputStream(file);
             ObjectOutput output = new ObjectOutputStream(buffer);) {
            output.writeObject(myRoom);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
