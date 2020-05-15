package io.bparolini;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        super();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public String getMessage() {
        return "Hello World from Singleton class!";
    }
}
