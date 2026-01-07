package oopsconcept;

import java.util.Scanner;

public class employee {

    static class Employee {
        static int count = 0;
        static String company = "Tarcin Tech";

        int id;
        String name;

        Employee(String name) {
            this.name = name;
            id = ++count;
        }

        void display() {
            System.out.println(id + " " + name + " " + company);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            Employee e = new Employee(sc.next());
            e.display();
        }

        System.out.println("Total: " + Employee.count);

        sc.close();
    }
}
