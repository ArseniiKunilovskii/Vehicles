package com.pluralsight;

public class SemiTruck extends Vehicle{
    private int numberOfTrailers;

    public void loadCargo(){
        System.out.println("Cargo is loading");
    }

    public void unloadCargo(){
        System.out.println("Cargo is unloading");
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }
}
