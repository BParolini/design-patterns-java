package io.bparolini.item;

import io.bparolini.packaging.Bottle;

public abstract class ColdDrink extends Item {
    public ColdDrink() {
        setPacking(new Bottle());
    }
}
