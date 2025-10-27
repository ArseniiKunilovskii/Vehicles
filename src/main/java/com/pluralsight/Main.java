package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped m = new Moped();
        Car c = new Car();
        SemiTruck s = new SemiTruck();
        HoverCraft h = new HoverCraft();

        System.out.println("m" );
        m.startEngine();
        System.out.println("c");
        c.closeTrunk();
        System.out.println("s");
        s.brake();
        System.out.println("h");
        h.hover();
    }
}
