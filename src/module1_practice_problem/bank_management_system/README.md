# 🏦 Bank Customer Management System — OOP Practice

This project demonstrates **Object-Oriented Programming (OOP)** concepts in Java using a simple Bank Customer Management System.

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
bank_management_system/
│
├── Customer.java
├── CustomerRegistry.java
└── README.md
```

## 👤 Customer Class

The `Customer` class stores and manages:

* Customer ID
* Name
* Account balance
* Account status

The fields are declared `private` and accessed through getters and setters to demonstrate **encapsulation**.

## ⚙️ Main Features

* Display customer details
* Validate customer information
* Deposit money
* Withdraw money
* Check premium customer status
* Deactivate an account
* Compare the balances of two customers

## 🧪 Validation

The system validates:

* Customer ID cannot be null or empty
* Name cannot be null or empty
* Account balance cannot be negative
* Deposit amount must be greater than `0`
* Withdrawal amount must be greater than `0`
* Withdrawal amount cannot exceed the account balance

## 🔄 Account Operations

```text
Create Customer
      ↓
Set Customer Information
      ↓
Display Details
      ↓
Deposit / Withdraw
      ↓
Check Premium Status
      ↓
Deactivate Account
      ↓
Compare Account Balances
```

## 🧠 Problem-Solving Practice

The `CustomerRegistry` class creates and manages multiple `Customer` objects. It also contains a `compareBalances()` method that compares two customers and returns the customer with the higher account balance.

## 🏷️ Practice Category

```text
Java
OOP
Encapsulation
Validation
Object Interaction
Problem Solving
```
