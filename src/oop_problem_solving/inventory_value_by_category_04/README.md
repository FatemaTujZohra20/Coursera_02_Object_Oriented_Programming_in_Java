# Inventory Value by Category

## 📖 Problem Statement

Create a Java console application that calculates the **total inventory value of products belonging to a specific category**.

Each inventory item contains:

- Item name
- Category
- Quantity
- Unit price

The inventory value of one item is calculated using:

```text
Inventory Value = Quantity × Unit Price
```

The program should filter the inventory items by a given category and calculate the total value only for the matching items.

---

## 🧑‍💻 Example

Suppose the inventory contains:

| Item | Category | Quantity | Unit Price |
|---|---|---:|---:|
| Laptop | Electronics | 5 | 5,000 |
| Milk | Groceries | 2 | 200 |
| Mouse | Electronics | 10 | 100 |
| Bread | Groceries | 3 | 50 |
| Knife | KitchenStainlessSteel | 2 | 10 |

If the requested category is:

```text
Electronics
```

Only these items should be considered:

```text
Laptop → 5 × 5000 = 25,000

Mouse → 10 × 100 = 1,000
```

Therefore:

```text
Total Electronics Inventory Value
= 25,000 + 1,000
= 26,000
```

Expected output:

```text
Total Inventory Value by Category: 26000.00
```

---

## 🏗️ Class Structure

The application is divided into three classes.

### `CategoryInventoryItem`

Represents a single inventory item.

**Responsibilities:**

- Store item information.
- Store the item's category.
- Store quantity and unit price.
- Provide getters and setters.
- Display item information using `toString()`.

### `CategoryValueCalculator`

Contains the calculation logic.

**Responsibilities:**

- Receive an array of `CategoryInventoryItem` objects.
- Receive a category as a parameter.
- Loop through the inventory items.
- Ignore `null` elements.
- Filter items by category.
- Calculate the inventory value of matching items.
- Add the values together.
- Return the total.

### `CategoryInventoryApp`

Acts as the main application class.

**Responsibilities:**

- Create inventory item objects.
- Set item information.
- Create the inventory array.
- Store items in the array.
- Display inventory items.
- Call the calculator.
- Display the calculated category value.

---

## 📂 Directory Structure

```text
── oop_problem_solving/
        └── inventory_value_by_category_04/
            ├── CategoryInventoryItem.java
            ├── CategoryValueCalculator.java
            └── CategoryInventoryApp.java
```

---

## 🔄 Program Flow

```text
CategoryInventoryApp
        ↓
Create inventory items
        ↓
Set item information
        ↓
Create CategoryInventoryItem[]
        ↓
Store items in the array
        ↓
Pass array + category to calculator
        ↓
Loop through items
        ↓
Check for null
        ↓
Check category
        ↓
Matching category?
      ↙       ↘
    YES        NO
     ↓          ↓
Calculate     Ignore
     ↓
Quantity × Unit Price
     ↓
Add to Total
     ↓
Return Total
     ↓
Display Result
```

---

## 🧠 Problem-Solving Algorithm

The main algorithm follows:

```text
totalInventoryValue = 0

FOR each item in the array

    IF item is not null

        IF item's category matches the requested category

            itemValue = quantity × unitPrice

            add itemValue to totalInventoryValue

RETURN totalInventoryValue
```

The reusable problem-solving pattern is:

> **Loop → Null Check → Filter → Calculate → Accumulate → Return**

---

## 🔍 Filtering

The most important new concept practiced in this problem is **filtering**.

Filtering means checking each object and using it only when it satisfies a specific condition.

For example:

```java
if (items[i].getCategory().equals(category)) {
    // Process this item
}
```

This means:

> Only process the item if its category matches the requested category.

For example:

```text
Laptop
Category → Electronics
Requested → Electronics
             ↓
           MATCH
             ↓
          Process
```

But:

```text
Milk
Category → Groceries
Requested → Electronics
             ↓
          NO MATCH
             ↓
           Ignore
```

---

## 🧩 Calculation Pattern

For every matching item:

```text
Quantity × Unit Price
```

For example:

```text
Laptop
5 × 5000
= 25,000
```

The result is then added to the running total:

```java
totalInventoryValue += itemValue;
```

So the complete calculation becomes:

```text
Filter
  ↓
Calculate
  ↓
Accumulate
```

---

## ⚠️ Handling `null`

The application intentionally contains an empty position in the array:

```java
items[5] = null;
```

The calculator handles this using:

```java
if (items[i] != null) {
    // process item
}
```

This prevents the application from attempting to call methods on a `null` object.

It also provides practice with arrays that may contain missing objects.

---

## 🔐 Encapsulation

The `CategoryInventoryItem` class uses private fields:

```java
private String itemName;
private String category;
private int quantity;
private float unitPrice;
```

The fields are accessed through getters and setters.

For example:

```java
item.setCategory("Electronics");
item.setQuantity(5);
item.setUnitPrice(5000.00f);
```

And:

```java
item.getCategory();
item.getQuantity();
item.getUnitPrice();
```

This demonstrates the OOP principle of **encapsulation**.

---

## 🧩 Separation of Responsibilities

Each class has a clear responsibility:

```text
CategoryInventoryItem
        ↓
       Data

CategoryValueCalculator
        ↓
    Calculation

CategoryInventoryApp
        ↓
 Application / Main
```

The `CategoryInventoryApp` does not perform the calculation itself.

Instead, it delegates the work to:

```java
CategoryValueCalculator.calculateValueByCategory(
    items,
    "Electronics"
);
```

This keeps the code organized and easier to maintain.

---

## 🎯 OOP Concepts Practiced

This problem provides practice with:

- Classes and objects
- Encapsulation
- Private fields
- Getters and setters
- `toString()`
- Arrays of objects
- Passing arrays to methods
- `for` loops
- `null` checking
- Object method calls
- String comparison
- Filtering
- Arithmetic calculations
- Accumulation
- Static methods
- Separation of responsibilities

---

## 📈 Progression From Previous Problems

This problem builds directly on the previous exercises.

### Problem 1 — Average Product Price

```text
Loop
 ↓
Null Check
 ↓
Sum
 ↓
Count
 ↓
Average
```

### Problem 2 — Average Employee Salary

```text
Loop
 ↓
Null Check
 ↓
Get Salary
 ↓
Sum
 ↓
Count
 ↓
Average
```

### Problem 3 — Total Inventory Value

```text
Loop
 ↓
Null Check
 ↓
Quantity × Unit Price
 ↓
Add to Total
```

### Problem 4 — Inventory Value by Category

```text
Loop
 ↓
Null Check
 ↓
Filter by Category
 ↓
Quantity × Unit Price
 ↓
Add to Total
```

The important new step is:

```text
Filter
```

---

## 🧠 Key Learning

The main lesson of this exercise is understanding how to filter objects before performing a calculation.

Instead of calculating the value of every item:

```text
All Items
   ↓
Calculate Everything
```

we now do:

```text
All Items
   ↓
Check Category
   ↓
Keep Matching Items
   ↓
Calculate Their Values
   ↓
Add Them Together
```

This pattern is extremely common in programming.

It can later be used for problems such as:

- Calculate sales for a specific category.
- Find employees from a specific department.
- Calculate students who passed.
- Find products above a certain price.
- Calculate orders from a specific customer.
- Find customers from a specific city.

---

## 🚀 Learning Objective

The goal of this exercise is to become comfortable with the following pattern:

```text
Array of Objects
        ↓
      Loop
        ↓
   Null Check
        ↓
     Filter
        ↓
    Calculate
        ↓
   Accumulate
        ↓
     Return
```

The most important concept introduced here is:

> **Filter first, then perform the required operation on the matching objects.**

This is an important foundation for solving more advanced Java problems involving collections, streams, predicates, and data processing.