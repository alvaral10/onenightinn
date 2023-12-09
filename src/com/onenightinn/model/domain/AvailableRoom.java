package com.onenightinn.model.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
public class AvailableRoom<Room> implements Serializable {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = -753517717949767546L;

    /** Holds state if rentals are available or not */
    private boolean available;

    /** state tax associated with this rental */
    private float stateTax;

    /** holds rooms objects */
    private ArrayList<Room> availableRoomList = new ArrayList<Room>();

    public AvailableRoom(String text, String jTextFieldLastNameText, String jTextFieldEmailText, String jTextFieldPasswordText, String jTextFieldRentalTypeText){

    }
    public AvailableRoom(float stateTax) {
        this.stateTax = stateTax;
    }

    public AvailableRoom(boolean available) {
        this.available = available;
    }

    /**
     */
    public AvailableRoom(String available, String stateTax) {
        this.available = Boolean.parseBoolean(available);
        this.stateTax = Float.parseFloat(stateTax);
    }

    /**
     * Add each available rental rooms into the ArrayList
     *
     */
    public void addRoom(Room room) {
        availableRoomList.add(room);
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
    public ArrayList<Room> getAvailableRoomList() {
        return availableRoomList;
    }

    /**
     * @param availableRoomList
     *            The availableRoomsList to set.
     */
    public void setAvailableRoomList(ArrayList<Room> availableRoomList) {
        this.availableRoomList = availableRoomList;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (available ? 1231 : 1237);
        result = prime * result + ((availableRoomList == null) ? 0 : availableRoomList.hashCode());
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
        AvailableRoom other = (AvailableRoom) obj;
        if (available != other.available)
            return false;
        if (availableRoomList == null) {
            if (other.availableRoomList != null)
                return false;
        } else if (!availableRoomList.equals(other.availableRoomList))
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

            for (Room room : availableRoomList) {
                stringBuffer.append(room);
            }

        } else
            stringBuffer.append("No Room is available");

        return stringBuffer.toString();
    }
}
