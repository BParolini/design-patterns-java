package io.bparolini.item;

import io.bparolini.packaging.Wrapper;

public abstract class Burger extends Item {
    public Burger() {
        setPacking(new Wrapper());
    }
}
