# 🏠 House Management System — OOP Practice

This project demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java through a simple House Management System.

The system manages house information, validates data, handles rental status, checks luxury status, and compares the prices of two houses.

---

## 🎯 Concepts Practiced

* Encapsulation
* Private fields
* Getters and setters
* Data validation
* Instance methods
* Static methods
* Object interaction
* Conditional statements
* Boolean values

---

## 📂 Project Structure

```text
house_management_system/
│
├── House.java
├── HouseRegistry.java
└── README.md
```

---

## 🏠 House Class

The `House` class represents a single house and stores:

* House ID
* Address
* Price
* Number of bedrooms
* Availability status

The fields are declared as `private` to protect the object's data.

---

# 🔐 OOP Concepts Explained

## 1. Encapsulation

Encapsulation means keeping an object's data protected inside the class and controlling access through methods.

In `House.java`, the fields are private:

```java
private String houseId;
private String address;
private double price;
private int bedrooms;
private boolean available;
```

Other classes cannot directly modify these fields. They must use getters and setters.

For example:

```java
house1.setPrice(15000.0);
```

instead of:

```java
house1.price = 15000.0;
```

This protects the internal state of the `House` object.

---

## 2. Private Fields

The `House` class uses private fields:

```java
private String houseId;
private String address;
private double price;
private int bedrooms;
private boolean available;
```

These fields represent the state of a house.

Because they are `private`, they can only be directly accessed inside the `House` class.

This is one of the main building blocks of encapsulation.

---

## 3. Getters and Setters

Getters are used to read private data.

Example:

```java
public double getPrice() {
    return this.price;
}
```

Setters are used to modify private data.

Example:

```java
public void setPrice(double price) {
    if (price >= 0) {
        this.price = price;
    }
}
```

In this project:

```text
Getter → Read object data
Setter → Modify object data
```

---

## 4. Data Validation

Data validation is practiced inside the setter methods.

For example, the price cannot be negative:

```java
public void setPrice(double price) {
    if (price >= 0) {
        this.price = price;
    } else {
        System.out.println("Error: Price cannot be negative.");
    }
}
```

String values are also validated:

```java
if (houseId != null && !houseId.trim().isEmpty())
```

The number of bedrooms must be greater than zero:

```java
if (bedrooms > 0)
```

Invalid values are rejected instead of being stored in the object.

---

## 5. Instance Methods

Instance methods operate on a particular `House` object.

Examples:

```java
rentHouse();
returnHouse();
isLuxuryHouse();
displayHouseDetails();
```

They are called using an object:

```java
house1.rentHouse();
```

or:

```java
house2.rentHouse();
```

These methods work with the data belonging to that specific house.

For example, `rentHouse()` changes the availability state of the current house.

---

## 6. Static Methods

The `HouseRegistry` class contains a static method:

```java
public static House comparePrices(House house1, House house2)
```

This method compares two `House` objects.

It does not belong to one particular house. Instead, it performs an operation involving multiple house objects.

It is called from `main()`:

```java
House expensiveHouse = comparePrices(house1, house2);
```

The method returns the house with the higher price.

If both prices are equal, it returns `null`.

---

## 7. Object Interaction

The project demonstrates interaction between multiple objects.

Two `House` objects are created:

```java
House house1 = new House();
House house2 = new House();
```

Then both objects are passed to:

```java
comparePrices(house1, house2);
```

Inside the method, their prices are compared:

```java
house1.getPrice()
house2.getPrice()
```

The method then returns one of the `House` objects.

This demonstrates how objects can be passed to methods and work together.

---

## 8. Conditional Statements

The project uses `if`, `else if`, and `else` statements for decision-making.

For example, `rentHouse()` checks whether the house is available:

```java
if (this.available) {
    this.available = false;
    System.out.println(this.houseId + " has been rented.");
} else {
    System.out.println(this.houseId + " is already rented.");
}
```

Conditional statements are also used for:

* Data validation
* Comparing house prices
* Checking luxury status
* Renting and returning houses

---

## 9. Boolean Values

The project uses a boolean field:

```java
private boolean available;
```

A boolean can contain:

```text
true
false
```

The availability status is changed using:

```java
house1.setIsAvailable(true);
```

and:

```java
house1.setIsAvailable(false);
```

The project also contains a boolean-returning method:

```java
public boolean isLuxuryHouse() {
    return this.price >= 100000;
}
```

For example:

```text
Price = $150,000
        ↓
150000 >= 100000
        ↓
true
```

The boolean result is then used with a ternary operator:

```java
house1.isLuxuryHouse()
        ? "Luxury house"
        : "not Luxury house"
```

---

# ⚙️ Main Features

The system can:

* Create house objects
* Store house information
* Validate house data
* Display house details
* Rent a house
* Return a house
* Check whether a house is a luxury house
* Compare the prices of two houses
* Handle invalid input

---

## 🔄 House Operations

```text
Create House
     ↓
Set House Information
     ↓
Validate Data
     ↓
Display Details
     ↓
Rent House
     ↓
Return House
     ↓
Check Luxury Status
     ↓
Compare Two Houses
```

---

## 🧪 Validation Tests

The program tests invalid values such as:

```java
house1.setPrice(-500000.0);
```

and:

```java
house1.setBedrooms(-5);
```

The setter methods reject these invalid values and display an error message.

---

## 🧠 Problem-Solving Pattern

The project follows this OOP structure:

```text
House.java
    ↓
Private fields
    ↓
Getters / Setters
    ↓
Validation
    ↓
Instance methods
    ↓
House behavior


HouseRegistry.java
    ↓
Creates multiple House objects
    ↓
Calls House methods
    ↓
Compares objects
    ↓
Static comparePrices() method
```

---

## 🎓 Key Learning

This project helped me understand how different OOP concepts work together rather than learning them as separate Java features.

### Core Pattern

```text
Private fields
      +
Getters / Setters
      +
Validation
      ↓
Encapsulation
```

And:

```text
One House object
      ↓
Instance methods
      ↓
House behavior
```

While:

```text
Multiple House objects
      ↓
Static method
      ↓
Object interaction
      ↓
Comparison
```

This project strengthens the foundation needed for more advanced Java problem-solving and backend development.

---

## 🏷️ Practice Category

```text
Java
OOP
Encapsulation
Private Fields
Getters & Setters
Data Validation
Instance Methods
Static Methods
Object Interaction
Conditional Statements
Boolean Values
Problem Solving
```
