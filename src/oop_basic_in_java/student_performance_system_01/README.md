# Student Performance System

## 📖 User Story

A school needs a simple console-based system to manage student information and evaluate academic performance.

As a **school administrator**, I want to:

- Register students with their name, age, and score.
- View all registered students.
- Check whether a student has passed or failed.
- Compare the scores of two students.
- Calculate the average score of all registered students.

The system should use **Object-Oriented Programming (OOP)** principles to keep student data encapsulated and separate student information from performance-related operations.

---

## 🏗️ Class Structure

### `StudentProfile`

Represents a student and contains:

- Student name
- Student age
- Score
- Getters and setters
- `toString()` for displaying student information

### `PerformanceAnalyzer`

Handles operations related to student performance:

- Compare two students' scores
- Check whether a student has passed
- Calculate the average score

### `StudentConsoleApp`

Provides the console interface for the administrator:

- View students
- Register students
- Check results
- Compare students
- Calculate average score

---

## 🎯 OOP Concepts Practiced

- Encapsulation
- Classes and objects
- Private fields
- Getters and setters
- `toString()`
- Passing objects to methods
- Arrays of objects
- Static methods
- Separation of responsibilities

---

## 📂 Project Structure

```text
└── oop_basic_in_java
    └── student_performance_system_01
        ├── PerformanceAnalyzer.java
        ├── StudentConsoleApp.java
        └── StudentProfile.java

```