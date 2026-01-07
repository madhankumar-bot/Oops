package oopsconcept;

import java.util.Scanner;

public class payment {

    static class Payment {
        void pay(double amount) {
            System.out.println("Payment done");
        }
    }

    static class CreditCardPayment extends Payment {
        void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class UPIPayment extends Payment {
        void pay(double amount) {
            System.out.println("Paid " + amount + " using UPI");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Payment type (card/upi): ");
        String type = sc.next();

        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        Payment p = type.equalsIgnoreCase("card")
                ? new CreditCardPayment()
                : new UPIPayment();

        p.pay(amt);

        sc.close();
    }
}
