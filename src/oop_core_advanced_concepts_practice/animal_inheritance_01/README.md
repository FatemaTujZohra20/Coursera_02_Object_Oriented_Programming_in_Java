# Animal Shelter — Inheritance & Polymorphism

This example demonstrates the core OOP concepts of **inheritance** and **runtime polymorphism** using an animal shelter scenario.

### Concepts Practiced

- **Inheritance** — `Dog`, `Cat`, and `Cow` extend the `Animal` class.
- **Method Overriding** — Each animal provides its own implementation of `sound()`.
- **Runtime Polymorphism** — An `Animal[]` stores different child objects, and Java calls the appropriate overridden `sound()` method at runtime.
- **Encapsulation** — The animal name is stored as a private field in the parent class.

### Class Structure

```text
Animal
├── Dog
├── Cat
└── Cow  
```



The AnimalShelterApp creates different animal objects and stores them in an Animal[] to demonstrate polymorphic behavior.