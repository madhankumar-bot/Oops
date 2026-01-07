package oopsconcept;

import java.util.Scanner;

public class vehicle {

    static class Vehicle {
        void start() {
            System.out.println("Vehicle started");
        }
        void stop() {
            System.out.println("Vehicle stopped");
        }
    }

    static class Car extends Vehicle {
        void openTrunk() {
            System.out.println("Car trunk opened");
        }
    }

    static class Bike extends Vehicle {
        void kickStart() {
            System.out.println("Bike kick started");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle (car/bike): ");
        String type = sc.next();

        if (type.equalsIgnoreCase("car")) {
            Car c = new Car();
            c.start();
            c.openTrunk();
            c.stop();
        } else {
            Bike b = new Bike();
            b.start();
            b.kickStart();
            b.stop();
        }

        sc.close();
    }
}
