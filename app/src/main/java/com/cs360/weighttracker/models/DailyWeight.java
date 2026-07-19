package com.cs360.weighttracker.models;

public class DailyWeight {

    private float userWeight;
    private long dateTime;

    public DailyWeight(float userWeight, long dateTime) {
        this.userWeight = userWeight;
        this.dateTime = dateTime;
    }


    ///////////////////////////
    ///       GETTERS      ///
    //////////////////////////

    /**
     * Returns the user weight as a float.
     */
    public float getUserWeight() {
        return userWeight;
    }

    /**
     * Returns the datetime in milliseconds.
     */
    public long getDateTimeMillis() {
        return dateTime;
    }


    ///////////////////////////
    ///       SETTERS      ///
    //////////////////////////

    public void setUserWeight(float userWeight) {
        this.userWeight = userWeight;
    }


    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

}
