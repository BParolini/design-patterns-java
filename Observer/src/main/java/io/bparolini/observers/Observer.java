package io.bparolini.observers;

import io.bparolini.Subject;

public abstract class Observer {
    protected Subject subject;
    protected String message;

    public Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    public abstract void update();

    public String getMessage() {
        return message;
    }
}
