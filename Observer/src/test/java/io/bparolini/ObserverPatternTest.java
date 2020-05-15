package io.bparolini;

import io.bparolini.observers.BinaryObserver;
import io.bparolini.observers.HexadecimalObserver;
import io.bparolini.observers.Observer;
import io.bparolini.observers.OctalObserver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObserverPatternTest {

    @Test
    public void observerTest() {
        Subject subject = new Subject();

        Observer binaryObserver = new BinaryObserver(subject);
        Observer octalObserver = new OctalObserver(subject);
        Observer hexObserver = new HexadecimalObserver(subject);

        subject.setValue(15);
        Assertions.assertTrue(binaryObserver.getMessage().endsWith(("1111")));
        Assertions.assertTrue(octalObserver.getMessage().endsWith(("17")));
        Assertions.assertTrue(hexObserver.getMessage().endsWith(("F")));

        System.out.println(String.format("Subject value: %d", subject.getValue()));
        System.out.println(binaryObserver.getMessage());
        System.out.println(octalObserver.getMessage());
        System.out.println(hexObserver.getMessage());

        subject.setValue(10);
        Assertions.assertTrue(binaryObserver.getMessage().endsWith(("1010")));
        Assertions.assertTrue(octalObserver.getMessage().endsWith(("12")));
        Assertions.assertTrue(hexObserver.getMessage().endsWith(("A")));

        System.out.println(String.format("Subject value: %d", subject.getValue()));
        System.out.println(binaryObserver.getMessage());
        System.out.println(octalObserver.getMessage());
        System.out.println(hexObserver.getMessage());
    }
}
