# Total Inventory Value

## 📖 Problem Statement

Create a Java console application that calculates the **total inventory value** of multiple products stored in an array of objects.

Each inventory product contains:

- Product name
- Quantity
- Unit price

The inventory value of one product is calculated using:

```text
Inventory Value = Quantity × Unit Price
```

The program then adds the inventory value of all available products to calculate the **total inventory value**.

---

## 🧑‍💻 Example

Suppose the inventory contains:

| Product | Quantity | Unit Price | Inventory Value |
|---|---:|---:|---:|
| Laptop | 5 | 5,000 | 25,000 |
| Mouse | 2 | 400 | 800 |
| Desktop | 3 | 10,000 | 30,000 |
| Keyboard | 5 | 500 | 2,500 |

The total inventory value is:

```text
25,000 + 800 + 30,000 + 2,500 = 58,300
```

Expected result:

```text
Total Inventory Value: 58300.00
```

---

## 🏗️ Class Structure

The application is divided into three classes.

### `InventoryProduct`

Represents a single inventory product.

**Responsibilities:**

- Store product information.
- Provide getters and setters.
- Display product details using `toString()`.

### `InventoryCalculator`

Contains the calculation logic.

**Responsibilities:**

- Receive an array of `InventoryProduct` objects.
- Loop through the array.
- Ignore `null` elements.
- Calculate each product's inventory value.
- Add each value to the total.
- Return the total inventory value.

### `InventoryApp`

Acts as the main application class.

**Responsibilities:**

- Create inventory product objects.
- Set product information.
- Create the product array.
- Store products in the array.
- Display product information.
- Call `InventoryCalculator`.
- Display the final result.

---

## 📂 Directory Structure

```text
── oop_problem_solving/
        └── total_inventory_value_03/
            ├── InventoryProduct.java
            ├── InventoryCalculator.java
            └── InventoryApp.java
```

---

## 🔄 Program Flow

```text
InventoryApp
     ↓
Create InventoryProduct objects
     ↓
Set product information
     ↓
Create InventoryProduct[]
     ↓
Store products in the array
     ↓
Pass array to InventoryCalculator
     ↓
Loop through products
     ↓
Check for null
     ↓
Get quantity and unit price
     ↓
Quantity × Unit Price
     ↓
Add value to total
     ↓
Return total
     ↓
Display result
```

---

## 🧠 Problem-Solving Pattern

The main algorithm follows this pattern:

```text
totalInventoryValue = 0

FOR each product in the array

    IF product is not null

        productValue = quantity × unitPrice

        add productValue to totalInventoryValue

RETURN totalInventoryValue
```

The important reusable pattern is:

> **Loop → Null Check → Get Data → Calculate → Accumulate → Return**

---

## ⚠️ Handling `null`

The application intentionally leaves one position in the array empty:

```java
products[4] = null;
```

The calculator handles this safely:

```java
if (products[i] != null) {
    // calculate inventory value
}
```

This prevents the program from trying to access methods on a `null` object.

It also provides practice with arrays that may contain missing objects.

---

## 🔐 Encapsulation

`InventoryProduct` keeps its fields private:

```java
private String productName;
private int quantity;
private float unitPrice;
```

The fields are accessed through public getters and setters.

For example:

```java
product.setQuantity(5);
product.setUnitPrice(5000.00f);
```

And:

```java
product.getQuantity();
product.getUnitPrice();
```

This demonstrates the basic OOP principle of **encapsulation**.

---

## 🧩 Separation of Responsibilities

Each class has a specific responsibility:

```text
InventoryProduct
       ↓
      Data

InventoryCalculator
       ↓
   Calculation

InventoryApp
       ↓
Application / Main
```

The `InventoryApp` does not perform the inventory calculation itself.

Instead, it delegates the calculation to:

```java
InventoryCalculator.calculateTotalInventoryValue(products);
```

This keeps the application easier to understand and maintain.

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
- Arithmetic calculations
- Accumulation
- Static methods
- Separation of responsibilities

---

## 📌 Key Learning

The previous average-price problem followed:

```text
Sum → Count → Average
```

This problem introduces a slightly different calculation:

```text
Quantity × Unit Price
        ↓
   Product Value
        ↓
    Add to Total
```

So the core pattern becomes:

```text
Array of Objects
        ↓
      Loop
        ↓
   Null Check
        ↓
  Get Object Data
        ↓
    Calculate
        ↓
   Accumulate
        ↓
  Return Result
```

This pattern can be reused for many real-world problems, such as:

- Total shopping cart value
- Total order value
- Total stock value
- Total sales amount
- Total invoice amount
- Total warehouse inventory value

---

## 🚀 Learning Objective

The goal of this exercise is not only to calculate an inventory value.

It is to practice breaking a problem into separate responsibilities:

```text
What data do I need?
        ↓
InventoryProduct

Where does the calculation happen?
        ↓
InventoryCalculator

Who runs the application?
        ↓
InventoryApp
```

This helps develop the habit of writing small, organized, and maintainable Java programs.

