package io.bparolini.observers;

import io.bparolini.Subject;

public class HexadecimalObserver extends Observer {

    public HexadecimalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        message = String.format("Binary string: %s", Integer.toHexString(subject.getValue()).toUpperCase());
    }
}
