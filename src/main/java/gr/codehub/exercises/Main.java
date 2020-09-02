package gr.codehub.exercises;

import gr.codehub.exercises.model.Account;
import gr.codehub.exercises.model.Product;
import gr.codehub.exercises.service.IStore;
import gr.codehub.exercises.store.InventoryRetailStore;
import gr.codehub.exercises.store.SimpleRetailStore;
import gr.codehub.exercises.store.StoreAccount;

public class Main {

    public static void main(String[] args) {

        testMethod1();
        testMethod2();
        testMethod3();
        testMethod4();
    }

    // Method for the first part of Exercise 1 of the second Assignment
    private static void testMethod1() {

        Account account1 = new Account("Ioannis Mpalatsos", 2150.0, 23);

        System.out.println("\n----------------------------------");
        System.out.println("    Welcome to your account!");
        System.out.println("----------------------------------");

        System.out.println("Account owner: " + account1.getOwner());
        System.out.println("Your balance: " + account1.getBalance());
        System.out.println("\n----------------------------------");
        System.out.println("Balance after withdraw: " + account1.withdraw(120.0));
        System.out.println("Balance after deposit: " + account1.deposit(50.0));
        System.out.println("Number of transactions made: " + account1.getNumberOfTransactions());
    }

    // Method for the second part of Exercise 1 of the second Assignment
    private static void testMethod2() {

        StoreAccount storeAccount1 = new StoreAccount("John Smith", 10000.0, 50
                , "The Cool Store", "basic");

        System.out.println("\n----------------------------------");
        System.out.println("    Welcome to your store account!");
        System.out.println("----------------------------------");

        System.out.println("Account owner: " + storeAccount1.getOwner());
        System.out.println("Your balance: " + storeAccount1.getBalance());
        System.out.println("Store name: " + storeAccount1.getStoreName());
        System.out.println("Account category: " + storeAccount1.getAccountCategory());
        System.out.println("\n----------------------------------");
        System.out.println("Balance after withdraw: " + storeAccount1.withdraw(1200.0));
        System.out.println("Balance after deposit: " + storeAccount1.deposit(550.0));
        System.out.println("Number of transactions made: " + storeAccount1.getNumberOfTransactions());
        System.out.println("\n----------------------------------");
        storeAccount1.changeCategory("Extra");
        storeAccount1.changeCategory("Gold");
    }

    // Method for the first part of Exercise 2 of the second Assignment
    private static void testMethod3() {

        Product p1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product p2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product p3 = new Product(3, "Chair. Luis XV", 100, 1000);

        IStore simple = new SimpleRetailStore();
        System.out.println("\n----------------------------------");
        simple.buy(p1);
        simple.buy(p3);
        simple.sell(p1);

        System.out.println("Revenue: " + simple.getRevenue());
    }

    // Method for the second part of Exercise 2 of the second Assignment
    private static void testMethod4() {

        Product p1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product p2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product p3 = new Product(3, "Chair. Luis XV", 100, 1000);

        IStore invStore = new InventoryRetailStore();
        System.out.println("\n----------------------------------");
        invStore.buy(p1);
        invStore.buy(p3);
        //invStore.sell(p1);
        System.out.println("Revenue: " + invStore.getRevenue());
        invStore.sell(p2);
        System.out.println("Inventory size: " + invStore.getInventory());
    }
}
