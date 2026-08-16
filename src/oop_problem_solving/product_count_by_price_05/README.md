# Product Count by Price

## 📖 Problem Statement

Create a Java console application that counts how many products have a **unit price greater than a given price**.

Each product contains:

- Product name
- Unit price

The program should:

1. Create multiple product objects.
2. Store the products in an array.
3. Ignore `null` elements.
4. Compare each product's price with a given price.
5. Count only the products whose price is greater than the given price.
6. Display the final count.

---

## 🧑‍💻 Example

Suppose the products are:

| Product | Unit Price |
|---|---:|
| Product 1 | 50.00 |
| Product 2 | 100.00 |
| Product 3 | 40.00 |
| Product 4 | 60.00 |

If the given price is:

```text
40.00
```

The program should check:

```text
Product 1 → 50.00 > 40.00 → YES
Product 2 → 100.00 > 40.00 → YES
Product 3 → 40.00 > 40.00 → NO
Product 4 → 60.00 > 40.00 → YES
```

Therefore:

```text
Product count = 3
```

Expected output:

```text
Product count by price above 40.00: 3
```

---

## 🏗️ Class Structure

The application is divided into three classes.

### `PriceProduct`

Represents a single product.

**Responsibilities:**

- Store product information.
- Store the unit price.
- Provide getters and setters.
- Display product information using `toString()`.

### `ProductPriceCounter`

Contains the counting logic.

**Responsibilities:**

- Receive an array of `PriceProduct` objects.
- Receive a price as a parameter.
- Loop through the products.
- Ignore `null` elements.
- Filter products based on price.
- Count matching products.
- Return the final count.

### `ProductPriceApp`

Acts as the main application class.

**Responsibilities:**

- Create product objects.
- Set product information.
- Create the product array.
- Store products in the array.
- Display product information.
- Call `ProductPriceCounter`.
- Display the final count.

---

## 📂 Directory Structure

```text
── oop_problem_solving/
        └── product_count_by_price_05/
            ├── PriceProduct.java
            ├── ProductPriceCounter.java
            └── ProductPriceApp.java
```

---

## 🔄 Program Flow

```text
ProductPriceApp
       ↓
Create PriceProduct objects
       ↓
Set product information
       ↓
Create PriceProduct[]
       ↓
Store products in the array
       ↓
Pass array + price to ProductPriceCounter
       ↓
Loop through products
       ↓
Check for null
       ↓
Check product price
       ↓
Price greater than given price?
       ↓
     YES
       ↓
Increase counter
       ↓
Return count
       ↓
Display result
```

---

## 🧠 Problem-Solving Algorithm

The main algorithm follows:

```text
count = 0

FOR each product in the array

    IF product is not null

        IF product price > given price

            increase count by 1

RETURN count
```

The reusable problem-solving pattern is:

> **Loop → Null Check → Filter → Count → Return**

---

## 🔍 Filtering

The main concept practiced in this problem is **filtering**.

Filtering means checking each object against a condition and processing only the objects that satisfy that condition.

The filtering condition is:

```java
if (products[i].getUnitPrice() > unitPrice) {
    countProductsAbovePrice++;
}
```

For example, if the given price is `40.00`:

```text
50.00  → greater than 40.00 → Include
100.00 → greater than 40.00 → Include
40.00  → greater than 40.00 → Ignore
60.00  → greater than 40.00 → Include
```

Only the matching products are counted.

---

## 🔢 Counting

Unlike the previous inventory problems, this problem does not calculate a monetary total.

Instead, it maintains a counter:

```java
int countProductsAbovePrice = 0;
```

Whenever a product satisfies the condition:

```java
countProductsAbovePrice++;
```

The counter represents the number of products that passed the filter.

---

## ⚠️ Handling `null`

The product array contains an empty position:

```java
products[4] = null;
```

The program checks for `null` before accessing the product:

```java
if (products[i] != null) {
    // Process product
}
```

This prevents the program from attempting to call a method on a `null` object.

It also provides practice with arrays that may contain missing objects.

---

## 🔐 Encapsulation

The `PriceProduct` class keeps its fields private:

```java
private String productName;
private float unitPrice;
```

The fields are accessed through public getters and setters.

For example:

```java
product.setProductName("Product 1");
product.setUnitPrice(50.00f);
```

And:

```java
product.getProductName();
product.getUnitPrice();
```

This demonstrates the OOP principle of **encapsulation**.

---

## 🧩 Separation of Responsibilities

Each class has a clear responsibility:

```text
PriceProduct
     ↓
    Data

ProductPriceCounter
     ↓
   Counting

ProductPriceApp
     ↓
Application / Main
```

The `ProductPriceApp` does not perform the filtering and counting itself.

Instead, it delegates the work to:

```java
ProductPriceCounter.countProductsAbovePrice(
    products,
    40.00f
);
```

This keeps the code organized and makes each class easier to understand.

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
- Conditional statements
- Comparison operators
- Filtering
- Counting
- Static methods
- Separation of responsibilities

---

## 🧪 Boundary Value Testing

An important part of this exercise is testing the boundary condition.

The program uses:

```java
products[i].getUnitPrice() > unitPrice
```

Notice that it uses `>` rather than `>=`.

If the given price is:

```text
40.00
```

Then:

```text
50.00 > 40.00 → true
100.00 > 40.00 → true
40.00 > 40.00 → false
60.00 > 40.00 → true
```

Therefore, the product priced exactly at `40.00` is not counted.

This is a useful programming habit:

> Test values above, below, and exactly at the boundary.

---

## 📈 Progression From Previous Problems

This problem continues the problem-solving patterns from the previous exercises.

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
Calculate
 ↓
Add to Total
```

### Problem 5 — Product Count by Price

```text
Loop
 ↓
Null Check
 ↓
Filter by Price
 ↓
Count
 ↓
Return
```

The important new combination in this problem is:

```text
Filter → Count
```

---

## 🧠 Key Learning

The main lesson of this exercise is learning how to filter objects and count only the objects that satisfy a condition.

Instead of processing every product:

```text
All Products
     ↓
Process Everything
```

we do:

```text
All Products
     ↓
Check Price
     ↓
Does it satisfy the condition?
     ↓
   YES
     ↓
Increase Count
```

This pattern can be applied to many real-world problems.

For example:

- Count employees earning above a salary.
- Count students who passed an exam.
- Count products below a certain price.
- Count customers from a specific city.
- Count orders above a certain amount.
- Count products belonging to a specific category.

---

## 🔁 Reusable Problem-Solving Pattern

The pattern practiced in this problem is:

```text
Array of Objects
        ↓
      Loop
        ↓
   Null Check
        ↓
     Filter
        ↓
      Count
        ↓
     Return
```

This is an important foundation for more advanced Java concepts such as:

- `ArrayList`
- Java Collections
- `Predicate`
- Streams API
- `filter()`
- `count()`

---

## 🚀 Learning Objective

The goal of this exercise is to become comfortable with:

```text
Loop
 ↓
Null Check
 ↓
Condition / Filter
 ↓
Counter
 ↓
Return Result
```

The most important concept is:

> **Filter the objects first, then count only the objects that satisfy the required condition.**

This exercise builds directly on the previous problems while introducing a simpler and very reusable **filter + count** pattern.