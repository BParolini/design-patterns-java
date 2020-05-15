package io.bparolini;

import io.bparolini.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {

    private final Set<Observer> observers = new HashSet<>();
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
