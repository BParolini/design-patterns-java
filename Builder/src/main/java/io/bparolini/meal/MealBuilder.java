package io.bparolini.meal;

import io.bparolini.item.ChickenBurger;
import io.bparolini.item.Coke;
import io.bparolini.item.Pepsi;
import io.bparolini.item.VegBurger;

public final class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
