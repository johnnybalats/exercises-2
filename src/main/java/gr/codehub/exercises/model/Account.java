package gr.codehub.exercises.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private String owner;
    private double balance;
    private int numberOfTransactions;

    public double deposit(double amount) {

        numberOfTransactions++;
        return balance += amount;
    }

    public double withdraw(double amount) {

        numberOfTransactions++;
        return balance -= amount;
    }
}
