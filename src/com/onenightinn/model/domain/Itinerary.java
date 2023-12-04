package com.onenightinn.model.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Calendar;

public class Itinerary implements Serializable {
    /**
     *
     */
    @Serial
    private static final long serialVersionUID = 1139378081831306791L;

    /** City DestinationId */
    private String cityDestinationId;

    /** City Destination */
    private String cityDestination;

    /** Check-in Date */
    private String checkinMonth;
    private String checkinDay;
    private String checkinYear;

    /** Check-in Time */
    private String checkinTime;

    /** Check-out Date */
    private String checkoutMonth;
    private String checkoutDay;
    private String checkoutYear;

    /** Check-out Time */
    private String checkoutTime;

    /** */
    private int qtyReservationDays = 0;

    /**
     *
     */
    public Itinerary() {

        // TODO Auto-generated constructor stub
    }


    public Itinerary(String cityDestination,
                     String checkinMonth,
                     String checkinDay,
                     String checkinYear,
                     String checkinTime,
                     String checkoutMonth,
                     String checkoutDay,
                     String checkoutYear,
                     String checkoutTime)
    {
        this.cityDestination = cityDestination;
        this.checkinMonth = checkinMonth;
        this.checkinDay = checkinDay;
        this.checkinYear = checkinYear;
        this.checkinTime = checkinTime;
        this.checkoutMonth = checkoutMonth;
        this.checkoutDay = checkoutDay;
        this.checkoutYear = checkoutYear;
        this.checkoutTime = checkoutTime;

        // determine qty of rental days by using Calendar class.
        Calendar pickUpCalendar = Calendar.getInstance();

        // -1 from pickUpMonth since Calendar is 0 based (Jan is 0)
        pickUpCalendar.set(Integer.parseInt(checkinYear),
                (Integer.parseInt(checkinMonth)-1),
                Integer.parseInt(checkinDay));

        Calendar dropOffCalendar = Calendar.getInstance();

        // -1 from pickUpMonth since Calendar is 0 based (Jan is 0)
        dropOffCalendar.set(Integer.parseInt(checkoutYear),
                (Integer.parseInt(checkoutMonth)-1),
                Integer.parseInt(checkoutDay));

        // convert pickUp and dropOff dates into milliseconds,
        // so we can determine the qty of rental days.
        long diffDayMillis =   dropOffCalendar.getTimeInMillis()
                - pickUpCalendar.getTimeInMillis();

        // divide by milli seconds in a day (24*60*60*1000)
        qtyReservationDays = (int)(diffDayMillis/86400000);


    }

    /**
     * @return Returns the checkoutDay.
     */
    public String getCheckoutDay() {
        return checkoutDay;
    }


    /**
     * @return Returns the checkoutMonth.
     */
    public String getCheckoutMonth() {
        return checkoutMonth;
    }


    /**
     * @return Returns the checkoutTime.
     */
    public String getCheckoutTime() {
        return checkoutTime;
    }


    /**
     * @return Returns the checkoutYear.
     */
    public String getCheckoutYear() {
        return checkoutYear;
    }


    /**
     *
     */
    public String getCityDestinationId() {
        return cityDestinationId;
    }


    /**
     *
     */
    public String getCityDestination() {
        return cityDestination;
    }
    
    /**
     *
     */
    public void setcityDestination(String cityDestination) {
        this.cityDestination = cityDestination;
    }


    /**
     * @return Returns the cityDestination.
     */
    public String getcityDestinationId() {
        return cityDestinationId;
    }


    /**
     * @return Returns the cityDestination
     */
    public String getcityDestination() {
        return cityDestination;
    }


    /**
     * @return Returns the checkinDay.
     */
    public String getCheckinDay() {
        return checkinDay;
    }


    /**
     * @return Returns the checkinMonth.
     */
    public String getCheckinMonth() {
        return checkinMonth;
    }


    /**
     * @return Returns the checkinTime.
     */
    public String getCheckinTime() {
        return checkinTime;
    }


    /**
     * @return Returns the checkinYear.
     */
    public String getCheckinYear() {
        return checkinYear;
    }


    /**
     * @return Returns the qtyReservationDays.
     */
    public int getQtyReservationDays() {
        return qtyReservationDays;
    }

    /**
     * Auto generated -
     * Alt+Shift+S and select 'Generate hashcode() and equals()...'
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((checkoutDay == null) ? 0 : checkoutDay.hashCode());
        result = prime * result
                + ((checkoutMonth == null) ? 0 : checkoutMonth.hashCode());
        result = prime * result
                + ((checkoutTime == null) ? 0 : checkoutTime.hashCode());
        result = prime * result
                + ((checkoutYear == null) ? 0 : checkoutYear.hashCode());
        result = prime
                * result
                + ((cityDestination == null) ? 0 : cityDestination
                .hashCode());
        result = prime
                * result
                + ((cityDestinationId == null) ? 0
                : cityDestinationId.hashCode());
        result = prime * result
                + ((checkinDay == null) ? 0 : checkinDay.hashCode());
        result = prime * result
                + ((checkinMonth == null) ? 0 : checkinMonth.hashCode());
        result = prime * result
                + ((checkinTime == null) ? 0 : checkinTime.hashCode());
        result = prime * result
                + ((checkinYear == null) ? 0 : checkinYear.hashCode());
        result = prime * result + qtyReservationDays;
        return result;
    }

    /**
     * Auto generated -
     * Alt+Shift+S and select 'Generate hashcode() and equals()...'
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Itinerary other = (Itinerary) obj;
        if (checkoutDay == null) {
            if (other.checkoutDay != null)
                return false;
        } else if (!checkoutDay.equals(other.checkoutDay))
            return false;
        if (checkoutMonth == null) {
            if (other.checkoutMonth != null)
                return false;
        } else if (!checkoutMonth.equals(other.checkoutMonth))
            return false;
        if (checkoutTime == null) {
            if (other.checkoutTime != null)
                return false;
        } else if (!checkoutTime.equals(other.checkoutTime))
            return false;
        if (checkoutYear == null) {
            if (other.checkoutYear != null)
                return false;
        } else if (!checkoutYear.equals(other.checkoutYear))
            return false;
        if (cityDestinationId == null) {
            if (other.cityDestinationId != null)
                return false;
        } else if (!cityDestinationId
                .equals(other.cityDestinationId))
            return false;
        if (cityDestination == null) {
            if (other.cityDestination != null)
                return false;
        } else if (!cityDestination.equals(other.cityDestination))
            return false;
        if (checkinDay == null) {
            if (other.checkinDay != null)
                return false;
        } else if (!checkinDay.equals(other.checkinDay))
            return false;
        if (checkinMonth == null) {
            if (other.checkinMonth != null)
                return false;
        } else if (!checkinMonth.equals(other.checkinMonth))
            return false;
        if (checkinTime == null) {
            if (other.checkinTime != null)
                return false;
        } else if (!checkinTime.equals(other.checkinTime))
            return false;
        if (checkinYear == null) {
            if (other.checkinYear != null)
                return false;
        } else if (!checkinYear.equals(other.checkinYear))
            return false;
        if (qtyReservationDays != other.qtyReservationDays)
            return false;
        return true;
    }

    public String toString()
    {
        StringBuffer strBfr = new StringBuffer();
        strBfr.append ("\ncityDestination Id:");
        strBfr.append (cityDestinationId);
        strBfr.append ("\ncityDestination City:");
        strBfr.append (cityDestination);
        strBfr.append ("\ncheckInMonth :");
        strBfr.append (checkinMonth);
        strBfr.append ("\ncheckInDay :");
        strBfr.append (checkinDay);
        strBfr.append ("\ncheckInYear :");
        strBfr.append (checkinYear);
        strBfr.append ("\ncheckInTime :");
        strBfr.append (checkinTime);
        strBfr.append ("\ncheckOutMonth :");
        strBfr.append (checkoutMonth);
        strBfr.append ("\ncheckOutDay :");
        strBfr.append (checkoutDay);
        strBfr.append ("\ncheckOutYear :");
        strBfr.append (checkoutYear);
        strBfr.append ("\ncheckOutTime :");
        strBfr.append (checkoutTime);
        strBfr.append ("\nqtyReservationDays :");
        strBfr.append (qtyReservationDays);

        return strBfr.toString();
    }
}
