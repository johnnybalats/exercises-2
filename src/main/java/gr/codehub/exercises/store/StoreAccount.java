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

    public void changeCategory() {

    }
}
