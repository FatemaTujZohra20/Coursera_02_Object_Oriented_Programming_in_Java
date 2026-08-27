# Animal Abstraction — OOP Practice

This example demonstrates abstraction in Java using an abstract Animal class and concrete subclasses: Dog, Cat, and Cow.

## Concepts Practiced
### Abstract Class

An abstract class is a class that cannot be directly instantiated. It acts as a blueprint for its child classes and can contain both regular and abstract methods.

### Abstract Method

An abstract method is a method declared without a body. Child classes must provide their own implementation.

public abstract void sound();
### Concrete Class

A concrete class is a fully implemented class whose objects can be created directly. In this example, Dog, Cat, and Cow are concrete classes.

Class Structure
```text
Animal (Abstract Class)
       |
   ┌───┼───┐
Dog   Cat   Cow
|      |      |
sound sound sound
```

## Key Idea

The Animal class defines what every animal should do, while each concrete subclass defines how it should do it.