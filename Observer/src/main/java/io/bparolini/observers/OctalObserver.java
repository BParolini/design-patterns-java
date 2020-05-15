package io.bparolini.observers;

import io.bparolini.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        message = String.format("Binary string: %s", Integer.toOctalString(subject.getValue()));
    }
}
