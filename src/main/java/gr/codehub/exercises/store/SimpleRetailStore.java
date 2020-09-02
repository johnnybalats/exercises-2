package gr.codehub.exercises.store;

import gr.codehub.exercises.model.Product;
import gr.codehub.exercises.service.IStore;

public class SimpleRetailStore implements IStore {

    private double totalBuyBalance;
    private double totalSellBalance;

    public SimpleRetailStore() {}

    @Override
    public void buy(Product product) {

        this.totalBuyBalance = product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {

        this.totalSellBalance = product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {

        double totalRevenue;
        totalRevenue = totalSellBalance - totalBuyBalance;
        System.out.println("Total buy balance: " + totalBuyBalance);
        System.out.println("Total sell balance: " + totalSellBalance);
        return totalRevenue;
    }

    @Override
    public int getInventory() {

        return 0;
    }

    @Override
    public void reset() {

    }
}
