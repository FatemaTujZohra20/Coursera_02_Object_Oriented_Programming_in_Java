# 🚗 Vehicle Management System — OOP Practice

This project demonstrates **Object-Oriented Programming (OOP)** concepts in Java using a simple Vehicle Management System.

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

## 📂 Project Structure

```text
vehicle_management_system/
│
├── Vehicle.java
├── VehicleRegistry.java
└── README.md
```

## 🚘 Vehicle Class

The `Vehicle` class stores and manages:

* Vehicle ID
* Brand
* Price
* Mileage
* Availability status

The fields are declared `private` and accessed through getters and setters to demonstrate **encapsulation**.

## ⚙️ Main Features

* Display vehicle details
* Validate vehicle information
* Sell a vehicle
* Check whether a vehicle is used
* Calculate a discounted price
* Compare the prices of two vehicles

## 🧪 Validation

The system validates:

* Vehicle ID cannot be empty
* Brand cannot be empty
* Price cannot be negative
* Mileage cannot be negative
* Discount must be between `0` and `100`

## 🧠 Problem-Solving Practice

The `VehicleRegistry` class creates and manages multiple `Vehicle` objects. It also contains a `comparePrices()` method that compares two vehicles and returns the vehicle with the higher price.

## 🏷️ Practice Category

```text
Java
OOP
Encapsulation
Validation
Object Interaction
Problem Solving
```
