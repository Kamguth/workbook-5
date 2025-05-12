package com.pluaralsight;


public class App {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Brown");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(10);

        Car fastRide = new Car();
        fastRide.setColor("Grey");
        fastRide.setFuelCapacity(15);
        fastRide.setNumberOfPassengers(4);
        fastRide.setCargoCapacity(30);

        SemiTruck tanker = new SemiTruck();
        tanker.setColor("White");
        tanker.setFuelCapacity(80);
        tanker.setNumberOfPassengers(2);
        tanker.setCargoCapacity(500);

        Hovercraft theJetsons = new Hovercraft();
        theJetsons.setColor("Red");
        theJetsons.setFuelCapacity(100);
        theJetsons.setNumberOfPassengers(4);
        theJetsons.setCargoCapacity(35);

        System.out.println("The Hovercraft is " + theJetsons.getColor() + " and it can hold " + theJetsons.getNumberOfPassengers() + " people.");

    }
}
