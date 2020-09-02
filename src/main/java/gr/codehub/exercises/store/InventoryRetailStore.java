package gr.codehub.exercises.store;

import gr.codehub.exercises.model.Product;
import gr.codehub.exercises.service.IStore;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {

    private List<Product> products;

    public InventoryRetailStore() {

        products = new ArrayList<>();
    }

    @Override
    public void buy(Product product) {

        products.add(product);
    }

    @Override
    public void sell(Product product) {

        products.remove(product);
    }

    @Override
    public double getRevenue() {

        double totalRevenue = 0;
        for (Product product: products)
            totalRevenue += product.getPriceWhenSell() - product.getPriceWhenBuy();

        return totalRevenue;
    }

    public int getInventory() {

        System.out.println("Your products in the inventory: ");
        for (Product product: products)
            System.out.println("\t-" + product.getName());

        return products.size();
    }

    public void reset() {

        products.clear();
    }
}
