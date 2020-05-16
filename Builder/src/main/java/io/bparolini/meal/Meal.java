package io.bparolini.meal;

import io.bparolini.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Meal {

    private final List<Item> items = new ArrayList<>();

    Meal() {
        super();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double getCost() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    @Override
    public String toString() {
        return items.stream().map(Item::toString)
            .collect(Collectors.joining("\n"));
    }

    public List<Item> getItems() {
        return items;
    }
}
