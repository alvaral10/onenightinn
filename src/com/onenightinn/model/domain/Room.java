package com.onenightinn.model.domain;

import java.io.Serial;
import java.io.Serializable;

public class Room implements Serializable {

    @Serial
    private static final long serialVersionUID=6688114759172186190L;

    /** Daily rate */
    private float rate;

    /** hotel */
    private String hotel;

    /** Room model */
    private String model;

    public Room(){

    }

    public Room(float rate, String hotel, String model){

        super();
        this.rate = rate;
        this.hotel = hotel;
        this.model = model;
    }

    public float getRate(){
        return rate;
    }

    public String hotel(){
        return hotel;
    }

    public String model(){
        return model;
    }

    @Override
    public int hashCode(){
        final int prime =31;
        int result =1;
        result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    public boolean validate (){

        if (rate == 0.0)
            return false;
        if (hotel == null)
            return false;
        if (model == null)
            return false;

        return true;
    }

    public boolean equals(Room room){

        if (rate != room.rate)
            return false;
        if (hotel != room.hotel)
            return false;
        if (!hotel.equals(room.hotel))
            return false;
        if (!model.equals(room.model))
            return false;

        return true;
    }

    public String toString(){

        StringBuffer strBfr = new StringBuffer();
        strBfr.append("Rate :");
        strBfr.append(rate);
        strBfr.append("\nHotel :");
        strBfr.append(hotel);
        strBfr.append("\nModel :");
        strBfr.append(model);

        return strBfr.toString();
    }
}
