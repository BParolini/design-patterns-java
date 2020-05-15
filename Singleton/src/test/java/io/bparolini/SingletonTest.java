package io.bparolini;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void singletonTest() {
        Singleton singleton = Singleton.getInstance();

        Assertions.assertNotNull(singleton);
        Assertions.assertEquals(singleton, Singleton.getInstance());
        Assertions.assertEquals(singleton.getMessage(), Singleton.getInstance().getMessage());

        System.out.println(singleton.getMessage());
    }
}
