package com.onenightinn.model.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
public class AvailableRooms<Room> implements Serializable {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = -753517717949767546L;

    /** Holds state if rentals are available or not */
    private boolean available;

    /** state tax associated with this rental */
    private float stateTax;

    /** holds car objects */
    private ArrayList<Room> availableRoomsList = new ArrayList<>(1);

    /**
     * ArrayList is not synchronized, so if you need multithreaded access,
     * consider using:
     */
    // List availableRoomsList = Collections.synchronizedList(new
    // ArrayList(...));

    public AvailableRooms() {
    }

    public AvailableRooms(float stateTax) {
        this.stateTax = stateTax;
    }

    public AvailableRooms(boolean available) {
        this.available = available;
    }

    /**
     */
    public AvailableRooms(boolean available, float stateTax) {
        this.available = available;
        this.stateTax = stateTax;
    }

    /**
     * Add each available rental car into the ArrayList
     *
     */
    public void addRoom(Room room) {
        availableRoomsList.add(room);
    }

    /**
     * @return Returns the available.
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available
     *            The available to set.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * @param stateTax
     *            The stateTax to set.
     */
    public void setStateTax(float stateTax) {
        this.stateTax = stateTax;
    }

    /**
     * @return Returns the stateTax.
     */
    public float getStateTax() {
        return stateTax;
    }

    /**
     * @return Returns the availableRoomsList.
     */
    public ArrayList<Room> getAvailableRoomsList() {
        return availableRoomsList;
    }

    /**
     * @param availableRoomsList
     *            The availableRoomsList to set.
     */
    public void setAvailableRoomsList(ArrayList<Room> availableRoomsList) {
        this.availableRoomsList = availableRoomsList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (available ? 1231 : 1237);
        result = prime
                * result
                + ((availableRoomsList == null) ? 0 : availableRoomsList
                .hashCode());
        result = prime * result + Float.floatToIntBits(stateTax);
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
        var other = (AvailableRooms) obj;
        if (available != other.available)
            return false;
        if (availableRoomsList == null) {
            if (other.availableRoomsList != null)
                return false;
        } else if (!availableRoomsList.equals(other.availableRoomsList))
            return false;
        if (Float.floatToIntBits(stateTax) != Float
                .floatToIntBits(other.stateTax))
            return false;
        return true;
    }

    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();

        if (available) {
            stringBuffer.append("Room is available");
            stringBuffer.append("\nState Tax: ");
            stringBuffer.append(stateTax);
            stringBuffer.append("\nAvailable Rooms List: ");

            for (Room room : availableRoomsList) {
                stringBuffer.append(room);
            }

        } else
            stringBuffer.append("No Room is available");

        return stringBuffer.toString();
    }
}
