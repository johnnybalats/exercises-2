package gr.codehub.exercises.store;

import gr.codehub.exercises.model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreAccount extends Account {

    private String storeName;
    private String accountCategory;

    public StoreAccount(String owner, Double balance, int numberOfTransactions, String storeName, String accountCategory) {

        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public void changeCategory(String accountCategory) {

        if (accountCategory.contains("Basic") || accountCategory.contains("Mid")
                || accountCategory.contains("Extra") || accountCategory.contains("Premium")) {
            this.accountCategory = accountCategory;
            System.out.println("You changed to: " + accountCategory);
        } else {
            System.out.println("This category does not exist!");
        }
    }
}
