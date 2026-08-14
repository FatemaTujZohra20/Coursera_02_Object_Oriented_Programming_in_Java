# Average Product Price

## 📖 Problem Statement

Create a Java program that calculates the **average price of all products** stored in an array of `Product` objects.

The program should:

- Store product information using a `Product` class.
- Use an array to store multiple `Product` objects.
- Ignore `null` positions in the array.
- Calculate the total price of all available products.
- Count the number of available products.
- Calculate and return the average price.
- Display the result through a separate application class.

---

## 🧑‍💻 Example

Suppose the product array contains:

```text
Laptop      → 80000
Mouse       → 1000
Keyboard    → 2000
null
```

Only the three available products should be considered.

```text
Total Price = 80000 + 1000 + 2000
            = 83000

Product Count = 3

Average Price = 83000 / 3
              = 27666.67
```

---

## 🏗️ Class Structure

The application is divided into three classes, with each class having a specific responsibility.

### `Product`

Represents a single product.

**Responsibilities:**

- Store product name.
- Store product price.
- Provide getters and setters.
- Provide a `toString()` method for displaying product information.

### `ProductPriceCalculator`

Contains the business logic for calculating product prices.

**Responsibilities:**

- Receive an array of `Product` objects.
- Loop through the array.
- Ignore `null` elements.
- Retrieve product prices using getters.
- Calculate the total price.
- Count available products.
- Calculate and return the average price.

### `ProductPriceApp`

Acts as the application entry point.

**Responsibilities:**

- Create `Product` objects.
- Set product information.
- Create and populate the product array.
- Call `ProductPriceCalculator`.
- Display the calculated average price.

---

## 📂 Directory Structure

```text
└── oop_problem_solving
│               └── average_product_price_01
│                   ├── Product.java
│                   ├── ProductPriceApp.java
│                   ├── ProductPriceCalculator.java
│                   └── README.md

```

---

## 🔄 Program Flow

```text
ProductPriceApp
       │
       │ creates
       ▼
 Product objects
       │
       │ stores
       ▼
   Product[]
       │
       │ passes array
       ▼
ProductPriceCalculator
       │
       ├── Loop through array
       ├── Check for null
       ├── Get product price
       ├── Add price to total
       ├── Count products
       └── Calculate average
       │
       ▼
 Average Product Price
       │
       ▼
ProductPriceApp
       │
       ▼
 Display result
```

---

## 🧠 Problem-Solving Pattern

The main algorithm follows this pattern:

```text
total price = 0
product count = 0

FOR each product in the array

    IF product is not null

        get product price

        add price to total

        increase product count

IF product count > 0

    return total price / product count

OTHERWISE

    return 0
```

This pattern is useful for many problems involving arrays of objects.

---

## 🎯 OOP Concepts Practiced

- Classes and objects
- Encapsulation
- Private fields
- Getters and setters
- `toString()`
- Arrays of objects
- Passing arrays to methods
- Passing objects between classes
- `for` loops
- `null` checking
- Accumulation
- Counting
- Average calculation
- Returning values from methods
- Separation of responsibilities

---

## 🧩 Separation of Responsibilities

Each class has a clear responsibility:

```text
Product
   ↓
Represents product data

ProductPriceCalculator
   ↓
Performs price calculations

ProductPriceApp
   ↓
Runs the application and displays results
```

This follows the basic principle of **Separation of Concerns**, where different parts of the program are responsible for different tasks.

---

## 🚀 Learning Objective

The main goal of this exercise is not just to calculate an average.

It is to practice a reusable problem-solving pattern:

```text
Array of Objects
       ↓
Loop
       ↓
Null Check
       ↓
Getter
       ↓
Calculation
       ↓
Count / Accumulate
       ↓
Return Result
```

This same pattern can later be applied to problems such as:

- Average employee salary
- Total inventory value
- Highest student score
- Lowest product price
- Counting passed students
- Average salary by department
- Total quantity by category

The goal is to understand the **problem-solving pattern** so it can be applied to different real-world domains.