package gr.codehub.exercises;

import gr.codehub.exercises.model.Account;

public class Main {

    public static void main(String[] args) {

        testMethod1();
    }

    // Method for Exercise 1 of the second Assignment
    private static void testMethod1() {

        Account account1 = new Account("Ioannis Mpalatsos", 2150.0, 23);

        System.out.println("\n----------------------------------");
        System.out.println("    Welcome to your account!");
        System.out.println("----------------------------------");

        System.out.println("Account owner: " + account1.getOwner());
        System.out.println("Your balance: " + account1.getBalance());

        System.out.println("Balance after withdraw: " + account1.withdraw(120.0));
        System.out.println("Balance after deposit: " + account1.deposit(50.0));
    }
}
