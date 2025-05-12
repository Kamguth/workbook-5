package com.pluaralsight;


public class App {
    public static void main(String[] args) {
        /*Moped slowRide = new Moped();
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
        theJetsons.setCargoCapacity(35);*/

        Moped slowRide = new Moped("Brown", 2, 10, 5);
        Car fastRide = new Car("Grey", 4, 30, 15);
        SemiTruck tanker = new SemiTruck("White", 2, 500, 80);
        Hovercraft theJetsons = new Hovercraft("Red", 4, 35, 100);

        System.out.println("The Hovercraft is " + theJetsons.getColor() + " and it can hold " + theJetsons.getNumberOfPassengers() + " people.");
        System.out.println("The Semi Truck is " + tanker.getColor() + " and it can hold " + tanker.getNumberOfPassengers() + " people.");
        System.out.println("The car is " + fastRide.getColor() + " and it can hold " + fastRide.getNumberOfPassengers() + " people.");
        System.out.println("The moped is " + slowRide.getColor() + " and it can hold " + slowRide.getNumberOfPassengers() + " people.");

    }
}
