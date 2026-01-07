package oopsconcept;

import java.util.Scanner;

public class StudentManagementSystem {

    static class Student {
        String name;
        int rollNumber;
        int marks;

        void setDetails(String n, int r, int m) {
            name = n;
            rollNumber = r;
            marks = m;
        }

        boolean isPassed() {
            return marks >= 40;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Passed: " + isPassed());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        s.setDetails(name, roll, marks);
        s.displayDetails();

        sc.close();
    }
}
