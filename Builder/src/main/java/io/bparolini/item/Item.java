package io.bparolini.item;

import io.bparolini.packaging.Packing;

public abstract class Item {
    private String name;
    private Packing packing;
    private double price;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Packing getPacking() {
        return packing;
    }

    void setPacking(Packing packing) {
        this.packing = packing;
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Item: %s, Packaging: %s, Price: %.2f",
            getName(), getPacking().pack(), getPrice());
    }
}
