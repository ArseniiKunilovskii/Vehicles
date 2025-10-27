package com.pluralsight;

public class HoverCraft extends Vehicle{
    private int airCushionPressure;

    public void hover(){
        System.out.println("hover");
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }
}
