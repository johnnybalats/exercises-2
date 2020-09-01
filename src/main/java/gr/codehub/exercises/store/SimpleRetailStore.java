package gr.codehub.exercises.store;

import gr.codehub.exercises.model.Product;
import gr.codehub.exercises.service.IStore;

public class SimpleRetailStore implements IStore {

    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public void buy(Product product) {

        totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {

        totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {

        return 0;
    }
}
