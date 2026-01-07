package oopsconcept;

import java.util.Scanner;

public class shape {

    static abstract class Shape {
        abstract double calculateArea();
    }

    static class Circle extends Shape {
        double r;
        Circle(double r) { this.r = r; }
        double calculateArea() {
            return 3.14 * r * r;
        }
    }

    static class Rectangle extends Shape {
        double l, b;
        Rectangle(double l, double b) {
            this.l = l;
            this.b = b;
        }
        double calculateArea() {
            return l * b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shape (circle/rectangle): ");
        String s = sc.next();

        Shape shape;
        if (s.equalsIgnoreCase("circle")) {
            System.out.print("Radius: ");
            shape = new Circle(sc.nextDouble());
        } else {
            System.out.print("Length & Breadth: ");
            shape = new Rectangle(sc.nextDouble(), sc.nextDouble());
        }

        System.out.println("Area: " + shape.calculateArea());

        sc.close();
    }
}

