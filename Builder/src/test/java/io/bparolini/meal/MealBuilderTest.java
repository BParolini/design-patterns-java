package io.bparolini.meal;

import io.bparolini.item.ChickenBurger;
import io.bparolini.item.Coke;
import io.bparolini.item.Pepsi;
import io.bparolini.item.VegBurger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MealBuilderTest {

    @Test
    public void mealBuilderTest() {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        Assertions.assertTrue(vegMeal.getItems().stream().anyMatch(item -> item instanceof VegBurger));
        Assertions.assertTrue(vegMeal.getItems().stream().anyMatch(item -> item instanceof Coke));
        Assertions.assertEquals(vegMeal.getCost(), 55d);

        Meal chickenMeal = builder.prepareChickenMeal();
        Assertions.assertTrue(chickenMeal.getItems().stream().anyMatch(item -> item instanceof ChickenBurger));
        Assertions.assertTrue(chickenMeal.getItems().stream().anyMatch(item -> item instanceof Pepsi));
        Assertions.assertEquals(chickenMeal.getCost(), 85.5d);

        System.out.println("Veg Meal");
        System.out.println(vegMeal);
        System.out.println(String.format("Total cost: %.2f", vegMeal.getCost()));

        System.out.println("Chicken Meal");
        System.out.println(chickenMeal);
        System.out.println(String.format("Total cost: %.2f", chickenMeal.getCost()));
    }
}
