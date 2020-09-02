package gr.codehub.exercises.service;

import gr.codehub.exercises.model.Product;

public interface IStore {

    void buy(Product product);
    void sell(Product product);
    double getRevenue();
    int getInventory();
    void reset();
}
