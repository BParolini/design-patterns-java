package io.bparolini.observers;

import io.bparolini.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        message = String.format("Binary string: %s", Integer.toBinaryString(subject.getValue()));
    }
}
