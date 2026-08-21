# 🏦 Bank Account Management — OOP Practice

A beginner-level **Java console application** created to practice **Object-Oriented Programming (OOP)** concepts such as encapsulation, object arrays, calculations, and filtering.

## 📁 Project Structure

```text
bank_account_04/
├── BankAccount.java
├── BankAccountCalculator.java
└── BankAccountApp.java
```

### Class Responsibilities

| Class                   | Responsibility                                   |
| ----------------------- | ------------------------------------------------ |
| `BankAccount`           | Represents a bank account and manages its data   |
| `BankAccountCalculator` | Performs calculations and filtering operations   |
| `BankAccountApp`        | Creates account objects and runs the application |

---

## 🎯 Concepts Practiced

This project focuses on the following Java and OOP concepts:

* Encapsulation
* Classes and objects
* Getters and setters
* `toString()`
* Arrays of objects
* Null checking
* Loops
* Passing objects to methods
* Accumulation
* Filtering objects based on conditions
* Separation of responsibilities

---

## 🔢 Operations

### 1. Calculate Total Balance

The application loops through the accounts and adds each account's balance to calculate the total balance.

```text
accounts
    ↓
  loop
    ↓
get balance
    ↓
add to total
    ↓
return total
```

The general idea is:

```java
total += account.getBalance();
```

This is an example of the **accumulation pattern**.

---

### 2. Filter Accounts by Balance

The application can find accounts whose balance is greater than a given amount.

```text
accounts
    ↓
  loop
    ↓
check condition
    ↓
  match?
   /   \
 YES    NO
  ↓      ↓
store  ignore
```

For example:

```text
Minimum Balance = 7000

John  → 8000  → match
Jane  → 12000 → match
Mike  → 3000  → ignore
Sara  → 15000 → match
```

Result:

```text
John
Jane
Sara
```

---

### 3. Filter Accounts by Account Number

The same filtering structure can be reused with a different condition.

For example:

```java
account.getAccountNumber() > minimumAccountNumber
```

The important idea is that **the filtering structure remains the same; only the condition changes**.

---

## 🧠 Main Learning: The Filtering Pattern

The most important concept learned from this project is the **filtering pattern**.

The general structure is:

```text
Input collection
       ↓
     Loop
       ↓
Check condition
       ↓
   Match?
    /   \
  YES    NO
   ↓      ↓
 Keep   Ignore
   ↓
Return matching objects
```

For example, if we want accounts with a balance greater than `7000`:

```java
if (account.getBalance() > 7000) {
    // keep account
}
```

If we want accounts with an account number greater than `1002`:

```java
if (account.getAccountNumber() > 1002) {
    // keep account
}
```

The **algorithm structure does not change**.

Only the condition changes.

This is an important step toward understanding how reusable software design works.

---

## 🔄 Same Pattern, Different Conditions

The filtering pattern can be reused for many different requirements.

### Filter by Balance

```java
account.getBalance() > minimumBalance
```

### Filter by Account Number

```java
account.getAccountNumber() > minimumAccountNumber
```

### Filter by Name

```java
account.getAccountHolderName().equals(name)
```

### Filter Below a Balance

```java
account.getBalance() < maximumBalance
```

### Filter Within a Balance Range

```java
account.getBalance() >= minimumBalance
        && account.getBalance() <= maximumBalance
```

This teaches an important programming principle:

> **Separate the filtering process from the condition used for filtering.**

---

## 📊 Sample Data

| Account Holder | Account Number | Balance |
| -------------- | -------------: | ------: |
| Alex           |           1001 |    5000 |
| John           |           1002 |    8000 |
| Jane           |           1003 |   12000 |
| Mike           |           1004 |    3000 |
| Sara           |           1005 |   15000 |

### Total Balance

```text
43,000.00
```

### Accounts Above 7,000

```text
John
Jane
Sara
```

### Accounts Above Account Number 1002

```text
Jane
Mike
Sara
```

---

## 🏗️ Design Structure

This project follows a simple separation of responsibilities:

```text
                 BankAccount
                      │
                      │ represents
                      ▼
               Account Objects
                      │
                      │ passed to
                      ▼
          BankAccountCalculator
                      │
          ┌───────────┴───────────┐
          │                       │
       Calculate               Filter
        Balance                Accounts
          │                       │
          └───────────┬───────────┘
                      ▼
               BankAccountApp
                      │
                      ▼
                Console Output
```

Each class has a clear responsibility instead of putting all the logic inside `main()`.

---

## 💡 Why the Filtering Pattern Matters

At first, filtering may look like a simple `if` statement.

But the deeper idea is more important.

Many real applications need to answer questions such as:

* Which users are active?
* Which products are expensive?
* Which employees belong to a department?
* Which orders are pending?
* Which accounts have enough balance?
* Which customers match a specific condition?

The general problem is often:

```text
Collection → Check each object → Keep matching objects
```

Once this pattern becomes familiar, many programming problems become easier to recognize.

---

## 🚀 Next Practice

After understanding the basic filtering pattern, the next exercises are:

* Filter accounts below a balance
* Filter accounts by account holder name
* Filter accounts by balance range
* Filter accounts using multiple conditions
* Create reusable filtering methods
* Explore `Predicate`
* Practice Lambdas
* Later implement filtering with Java Streams

---

## ☕ Key Takeaway

> **Don't memorize the solution. Understand the pattern behind it.**

The goal is not just to write a filtering method that works.

The goal is to recognize:

```text
Collection
    ↓
Loop
    ↓
Condition
    ↓
Matching objects
    ↓
Result
```

Once this pattern becomes natural, you can apply the same thinking to many different Java problems.

**One pattern → many problems.** ☕
