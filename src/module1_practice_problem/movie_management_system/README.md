# 🎬 Movie Management System — OOP Practice

This project demonstrates fundamental **Object-Oriented Programming (OOP)** concepts in Java through a simple Movie Management System.

The system manages movie information, validates movie data, handles rental availability, categorizes ratings and durations, and updates movie ratings.

---

## 🎯 Concepts Practiced

* Encapsulation
* Private fields
* Constructors
* Getters and setters
* Data validation
* Instance methods
* Boolean values
* Conditional statements
* Object state management
* Method parameters
* Returning values

---

## 📂 Project Structure

```text
movie_management_system/
│
├── Movie.java
├── MovieRegistry.java
└── README.md
```

---

## 🎬 Movie Class

The `Movie` class represents a movie and stores:

* Movie ID
* Title
* Genre
* Rating
* Duration
* Availability status

The fields are declared as `private` to protect the internal state of each `Movie` object.

---

# 🔐 OOP Concepts Practiced

## 1. Encapsulation

The movie information is protected using `private` fields.

```java
private String movieId;
private String title;
private String genre;
private double rating;
private int duration;
private boolean available;
```

The data is accessed and modified through getters and setters instead of being accessed directly.

---

## 2. Constructors

The project uses two constructors.

### Default Constructor

```java
public Movie() {
    this.movieId = "Unknown";
    this.title = "Unknown";
    this.genre = "Unknown";
    this.rating = 0.0;
    this.duration = 1;
    this.available = true;
}
```

### Parameterized Constructor

The parameterized constructor allows a movie to be created with specific information.

```java
public Movie(String movieId,
             String title,
             String genre,
             double rating,
             int duration,
             boolean available)
```

The constructor uses setter methods so that validation rules are applied when creating the object.

---

## 3. Getters and Setters

Getters are used to read private movie information.

Example:

```java
public double getRating() {
    return this.rating;
}
```

Setters are used to update movie information.

Example:

```java
public void setRating(double rating) {
    if (rating >= 0 && rating <= 10) {
        this.rating = rating;
    }
}
```

---

## 4. Data Validation

The setters validate movie information before storing it.

Examples:

```text
Movie ID → cannot be null or empty
Title → cannot be null or empty
Genre → cannot be null or empty
Rating → must be between 0 and 10
Duration → must be greater than 0
```

This prevents invalid data from being stored in the object.

---

## 5. Instance Methods

The `Movie` class contains methods that operate on individual movie objects.

Examples:

```java
displayMovieDetails();
rentMovie();
returnMovie();
getRatingCategory();
getDurationCategory();
updateRating();
```

For example:

```java
movie1.rentMovie();
```

The method changes the availability state of `movie1`.

---

## 6. Boolean Values

The project uses a boolean field to represent movie availability:

```java
private boolean available;
```

It can contain:

```text
true  → Available
false → Not Available
```

The availability changes when a movie is rented or returned.

---

## 7. Conditional Statements

The project uses `if`, `else if`, and `else` statements for decision-making.

For example, the rating category is determined using conditions:

```text
8.0–10.0 → Excellent
6.0–7.9  → Good
4.0–5.9  → Average
0.0–3.9  → Poor
```

Conditional statements are also used for validation, renting, returning, and updating ratings.

---

## 8. Object State Management

The availability of a movie changes during the program.

```text
Available
    ↓
Rent Movie
    ↓
Not Available
    ↓
Return Movie
    ↓
Available
```

This demonstrates how an object's internal state can change through its methods.

---

## ⚙️ Main Features

The system can:

* Create movie objects
* Store movie information
* Validate movie data
* Display movie details
* Categorize movie ratings
* Categorize movie duration
* Rent a movie
* Return a movie
* Update a movie rating
* Compare movie ratings
* Work with multiple movie objects

---

## ⭐ Rating Categories

```text
Rating 8.0–10.0 → Excellent
Rating 6.0–7.9  → Good
Rating 4.0–5.9  → Average
Rating 0.0–3.9  → Poor
```

---

## ⏱️ Duration Categories

```text
90 minutes or less → Short
91–150 minutes     → Medium
More than 150 min  → Long
```

---

## 🔄 Movie Management Flow

```text
Create Movie
     ↓
Set Movie Information
     ↓
Validate Data
     ↓
Display Movie Details
     ↓
Check Rating Category
     ↓
Check Duration Category
     ↓
Rent Movie
     ↓
Return Movie
     ↓
Update Rating
     ↓
Compare Movies
```

---

## 🧠 Problem-Solving Practice

This project extends the same OOP pattern practiced in previous projects such as **Book, Vehicle, Customer, and House Management Systems**.

The progression is:

```text
Private Fields
      ↓
Getters / Setters
      ↓
Validation
      ↓
Constructors
      ↓
Instance Methods
      ↓
Object State Changes
      ↓
Object Comparison
```

The project provides a foundation for more advanced problems involving **arrays of objects, searching, filtering, collections, and Java backend development**.

---

## 🏷️ Practice Category

```text
Java
OOP
Encapsulation
Constructors
Private Fields
Getters & Setters
Data Validation
Instance Methods
Boolean Values
Conditional Statements
Object State Management
Problem Solving
```
