package com.onenightinn.model.domain;

import java.io.Serial;
import java.io.Serializable;

public class Rooms implements Serializable {

    @Serial
    private static final long serialVersionUID=6688114759172186190L;

    /** Daily rate */
    private float rate;

    /** hotel */
    private String hotel;

    /** Room model */
    private String model;

    public Rooms(){

    }

    public Rooms(float rate, String hotel, String model){

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

    public boolean validate (){

        if (rate == 0.0) return false;
        if (hotel == null) return false;
        if (model == null) return false;

        return true;
    }

    public boolean equals(Rooms rooms){

        if (rate != rooms.rate) return false;
        if (hotel != rooms.hotel) return false;
        if (!hotel.equals(rooms.hotel)) return false;
        if (!model.equals(rooms.model)) return false;

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
