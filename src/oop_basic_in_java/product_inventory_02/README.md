# Product Inventory

## 📖 Problem Statement

Create a Java console application that manages a small product inventory.

Each product contains:

- Product name
- Quantity
- Unit price

The application should:

1. Create multiple product objects.
2. Store the products in an array.
3. Display all available products.
4. Calculate the total inventory value.

The inventory value of each product is calculated using:

```text
Inventory Value = Quantity × Unit Price
```

The total inventory value is calculated by adding the inventory value of every available product.

---

## 🧑‍💻 Example

Suppose the inventory contains:

| Product | Quantity | Unit Price | Inventory Value |
|---|---:|---:|---:|
| Laptop | 5 | 5,000.00 | 25,000.00 |
| MacBookPro | 10 | 100,000.00 | 1,000,000.00 |
| Ram | 20 | 100.00 | 2,000.00 |
| Desktop | 5 | 20,000.00 | 100,000.00 |
| Keyboard | 10 | 500.00 | 5,000.00 |
| WebCam | 10 | 1,000.00 | 10,000.00 |

The total inventory value is:

```text
25,000
+ 1,000,000
+ 2,000
+ 100,000
+ 5,000
+ 10,000
----------------
1,142,000
```

Expected result:

```text
Total Inventory Value : 1142000.0
```

---

## 🏗️ Class Structure

The application is divided into three classes.

### `StoreProduct`

Represents a single product in the inventory.

**Responsibilities:**

- Store product information.
- Store product quantity.
- Store product unit price.
- Provide getters and setters.
- Display product information using `toString()`.

### `InventoryValueCalculator`

Contains the inventory calculation logic.

**Responsibilities:**

- Receive an array of `StoreProduct` objects.
- Loop through the products.
- Ignore `null` elements.
- Calculate each product's inventory value.
- Add each value to the total.
- Return the total inventory value.

### `ProductInventoryApp`

Acts as the main application class.

**Responsibilities:**

- Create product objects.
- Set product information.
- Create the product array.
- Store products in the array.
- Display product information.
- Call the calculation method.
- Display the total inventory value.

---

## 📂 Directory Structure

```text
src/
└── oop_basic_in_java/
    └── product_inventory_02/
        ├── StoreProduct.java
        ├── InventoryValueCalculator.java
        └── ProductInventoryApp.java
```

---

## 🔄 Program Flow

```text
ProductInventoryApp
        ↓
Create StoreProduct objects
        ↓
Set product information
        ↓
Create StoreProduct[]
        ↓
Store products in the array
        ↓
Display products
        ↓
Pass array to InventoryValueCalculator
        ↓
Loop through products
        ↓
Check for null
        ↓
Quantity × Unit Price
        ↓
Add value to total
        ↓
Return total
        ↓
Display total inventory value
```

---

## 🧠 Problem-Solving Algorithm

The calculation follows this algorithm:

```text
totalInventoryValue = 0

FOR each product in the array

    IF product is not null

        productValue = quantity × unitPrice

        totalInventoryValue += productValue

RETURN totalInventoryValue
```

The main problem-solving pattern is:

> **Loop → Null Check → Calculate → Accumulate → Return**

---

## 🧮 Inventory Value Calculation

For each product, the inventory value is calculated using:

```text
Quantity × Unit Price
```

For example:

```text
Laptop

Quantity = 5
Unit Price = 5000

5 × 5000 = 25000
```

The result is then added to the running total:

```java
totalInventoryValue +=
        products[i].getQuantity() * products[i].getUnitPrice();
```

---

## 🔢 Accumulation

The calculator starts with:

```java
float totalInventoryValue = 0;
```

Then every product contributes its inventory value:

```text
Start
  ↓
0

Laptop
  ↓
0 + 25,000
  ↓
25,000

MacBookPro
  ↓
25,000 + 1,000,000
  ↓
1,025,000

Ram
  ↓
1,025,000 + 2,000
  ↓
1,027,000

...
```

Finally, the accumulated value is returned.

This is called the **accumulation pattern**.

---

## ⚠️ Handling `null`

The product array intentionally contains an empty position:

```java
products[6] = null;
```

The calculator checks for `null` before accessing the object:

```java
if (products[i] != null) {
    // Process product
}
```

This prevents a `NullPointerException`.

It also demonstrates that an object array can contain both actual objects and empty positions.

---

## 🔐 Encapsulation

The `StoreProduct` class uses private fields:

```java
private String productName;
private int quantity;
private float unitPrice;
```

The fields are not accessed directly from the main application.

Instead, setters are used to modify the data:

```java
product.setProductName("Laptop");
product.setQuantity(5);
product.setUnitPrice(5000.00f);
```

And getters are used to retrieve the data:

```java
product.getProductName();
product.getQuantity();
product.getUnitPrice();
```

This demonstrates the OOP principle of **encapsulation**.

---

## 🧩 Separation of Responsibilities

Each class has a specific responsibility:

```text
StoreProduct
     ↓
Stores product data

InventoryValueCalculator
     ↓
Performs inventory calculations

ProductInventoryApp
     ↓
Runs the application
```

The `ProductInventoryApp` does not perform the calculation itself.

Instead, it delegates the calculation to:

```java
InventoryValueCalculator.totalInventoryValue(products);
```

This keeps the application logic and calculation logic separate.

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
- Arithmetic operations
- Accumulation
- Static methods
- Separation of responsibilities

---

## 🧠 Key Learning

The most important lesson of this exercise is learning how to perform a calculation across an array of objects.

Instead of treating the array as a collection of raw values, the program retrieves the required information from each object:

```text
Array of StoreProduct objects
            ↓
       Get quantity
            ↓
      Get unit price
            ↓
    Quantity × Unit Price
            ↓
       Add to total
```

This is an important foundation for working with collections and more advanced data-processing techniques later.

---

## 📈 Problem-Solving Pattern

The pattern practiced in this problem is:

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
     Return
```

This pattern can be reused for many problems.

For example:

- Calculate total sales.
- Calculate total order value.
- Calculate total salary expense.
- Calculate total marks.
- Calculate total shopping cart value.
- Calculate total inventory value.

---

## 🔁 Connection With Previous Problems

This problem builds on the same fundamental pattern used in earlier exercises.

### Average Product Price

```text
Loop
 ↓
Null Check
 ↓
Get Price
 ↓
Add Price
 ↓
Count
 ↓
Calculate Average
```

### Average Employee Salary

```text
Loop
 ↓
Null Check
 ↓
Get Salary
 ↓
Add Salary
 ↓
Count
 ↓
Calculate Average
```

### Product Inventory

```text
Loop
 ↓
Null Check
 ↓
Get Quantity
 ↓
Get Unit Price
 ↓
Quantity × Unit Price
 ↓
Add to Total
```

The new focus here is calculating a value from **multiple properties of the same object**.

---

## 🚀 Learning Objective

The goal of this exercise is to become comfortable with:

```text
Array of Objects
        ↓
Access Object Data
        ↓
Perform Calculation
        ↓
Accumulate Result
```

The most important takeaway is:

> **When processing an array of objects, retrieve the required data through the object's methods, perform the required calculation, and accumulate the result.**

This provides a strong foundation for the next OOP problem-solving exercises involving filtering, counting, searching, and more complex calculations.