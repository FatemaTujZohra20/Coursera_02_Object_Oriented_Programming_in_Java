# 📚 Book Management System — OOP Encapsulation Practice

This project demonstrates **Object-Oriented Programming (OOP)** concepts in Java using a simple Book Management System.

The project focuses mainly on **encapsulation**, **data validation**, **object behavior**, and **working with multiple objects**.

---

## 🎯 Learning Objectives

Through this project, I practiced:

* Encapsulation
* Private fields
* Getters and setters
* Data validation
* Object state management
* Instance methods
* Static methods
* Passing objects as method parameters
* Returning objects from methods
* Conditional statements
* Boolean values
* Basic problem-solving

---

## 📂 Project Structure

```text
book_management_system/
│
├── Book.java
└── BookRegistry.java
```

---

## 🧱 Book Class

The `Book` class represents a single book.

### Private Fields

```java
private String bookId;
private String title;
private String author;
private double price;
private boolean available;
```

The fields are declared `private` to protect the object's internal state.

They can only be accessed or modified through public methods.

---

## 🔐 Encapsulation

Encapsulation is implemented by:

* Declaring fields as `private`
* Providing public getter methods
* Providing public setter methods
* Validating data inside setter methods

For example:

```java
public void setPrice(double price) {
    if (price >= 0) {
        this.price = price;
    } else {
        System.out.println("Error: Price cannot be negative.");
    }
}
```

This prevents an invalid negative price from being stored.

---

## ✅ Data Validation

The class validates important values before updating the object's state.

### Book ID

The book ID cannot be:

* `null`
* Empty
* Blank

### Title

The title cannot be:

* `null`
* Empty
* Blank

### Author

The author cannot be:

* `null`
* Empty
* Blank

### Price

The price must be:

```text
price >= 0
```

---

## 📖 Book Behavior

The `Book` class contains methods that represent actions a book can perform.

### Display Book Details

```java
displayBookDetails()
```

Returns the book's:

* ID
* Title
* Author
* Price
* Availability status

---

### Borrow Book

```java
borrowBook()
```

If the book is available, its status changes to borrowed.

```text
Available → Borrowed
```

If the book is already borrowed, an error message is displayed.

---

### Return Book

```java
returnBook()
```

If the book is borrowed, its status changes back to available.

```text
Borrowed → Available
```

---

### Check Expensive Status

```java
isExpensive()
```

A book is considered expensive when:

```text
price >= $50
```

The method returns either:

```text
true
```

or:

```text
false
```

---

# 🔄 Comparing Two Book Objects

The `BookRegistry` class contains a static method:

```java
public static Book comparePrices(Book book1, Book book2)
```

This method compares the prices of two `Book` objects.

### Logic

```text
book1 price > book2 price
        ↓
    return book1

book2 price > book1 price
        ↓
    return book2

prices are equal
        ↓
    return null
```

The method returns the **Book object itself**, not just its price.

For example:

```java
Book expensiveBook = comparePrices(book1, book2);
```

The returned object can then be used:

```java
expensiveBook.getTitle();
expensiveBook.getPrice();
```

---

## 🧠 Object Interaction

This project demonstrates how one method can work with multiple objects.

```java
comparePrices(book1, book2);
```

Here:

* `book1` is the first object
* `book2` is the second object
* The method compares their state
* The method returns one of the objects

This is an important OOP problem-solving pattern.

---

## 🧪 Testing

The program tests:

1. Creating two `Book` objects
2. Setting book information
3. Displaying book information
4. Borrowing a book
5. Attempting to borrow an already borrowed book
6. Returning a book
7. Comparing book prices
8. Checking whether books are expensive
9. Testing invalid price input

---

## 💻 Example Output

```text
Book 1:
ID: B001
Title: Clean Code
Author: Robert C. Martin
Price: $45.0
Status: Available

Book 2:
ID: B002
Title: Effective Java
Author: Joshua Bloch
Price: $55.0
Status: Available

Borrowing Book 1:
Clean Code has been borrowed.

Trying to borrow Book 1 again:
Clean Code is already borrowed.

Returning Book 1:
Clean Code has been returned.

More expensive book:
Effective Java - $55.0

Expensive Status:
Clean Code is not expensive
Effective Java is expensive

Testing price validation:
Error: Price cannot be negative.
```

---

## 📌 Key OOP Concepts Practiced

| Concept           | How It Is Used                              |
| ----------------- | ------------------------------------------- |
| Encapsulation     | Private fields with getters/setters         |
| Validation        | Setters validate input                      |
| Object State      | Availability changes when borrowed/returned |
| Instance Methods  | `borrowBook()`, `returnBook()`              |
| Boolean Logic     | Checking availability                       |
| Static Method     | `comparePrices()`                           |
| Object Parameters | Passing `Book` objects to methods           |
| Object Return     | Returning a `Book` object                   |
| Conditional Logic | `if-else` comparisons                       |

---

## 🚀 What I Learned

The most important lesson from this exercise is that a class should contain both **data and behavior**.

The `Book` class manages the state and behavior of one book, while `BookRegistry` performs operations involving multiple `Book` objects.

The project helped me understand how encapsulation protects object data and how objects can be passed between methods to solve problems.

---

## 🏷️ Practice Category

```text
Java
OOP
Encapsulation
Getters & Setters
Validation
Object Interaction
Problem Solving
```
