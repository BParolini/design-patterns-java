# Observer Pattern
description by [Tutorials Point](https://www.tutorialspoint.com/design_pattern/observer_pattern.htm)

---

Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.

## Implementation

Observer pattern uses three actor classes. Subject, Observer and Client. Subject is an object having methods to attach and detach observers to a client object. We have created an abstract class Observer and a concrete class Subject that is extending class Observer.

ObserverPatternDemo, our demo class, will use Subject and concrete class object to show observer pattern in action.

![Observer Pattern](https://www.tutorialspoint.com/design_pattern/images/observer_pattern_uml_diagram.jpg)
