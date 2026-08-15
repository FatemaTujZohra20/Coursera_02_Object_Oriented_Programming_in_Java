# Average Employee Salary

## 📖 Problem Statement

Create a Java program that calculates the **average salary of employees** stored in an array of `Employee` objects.

The program should also calculate the **average salary of employees in a specific department**.

---

## 🏗️ Class Structure

```text
Employee
    ↓
Stores employee information

EmployeeSalaryCalculator
    ↓
Performs salary calculations

EmployeeSalaryApp
    ↓
Creates objects, calls methods, and displays results
```

---

## 📂 Directory Structure

```text
average_employee_salary_02/
├── Employee.java
├── EmployeeSalaryCalculator.java
└── EmployeeSalaryApp.java
```

---

## 🧮 Problem 1: Average Salary

Calculate the average salary of all non-null employees.

### Pattern

```text
Employee[]
    ↓
Loop
    ↓
Null Check
    ↓
Get Salary
    ↓
Sum + Count
    ↓
Average
```

---

## 🏢 Problem 2: Average Salary by Department

Calculate the average salary only for employees belonging to a specific department.

### Pattern

```text
Employee[]
    ↓
Loop
    ↓
Null Check
    ↓
Department Filter
    ↓
Get Salary
    ↓
Sum + Count
    ↓
Average
```

---

## 🎯 Concepts Practiced

- Classes and objects
- Encapsulation
- Getters and setters
- Arrays of objects
- `null` checking
- Loops
- Passing arrays to methods
- `String.equals()`
- Filtering
- Sum and count
- Average calculation
- Separation of responsibilities

---

## 🧠 Key Learning

The first problem practices:

> **Sum → Count → Average**

The second problem extends it to:

> **Filter → Sum → Count → Average**

The goal is to recognize and reuse these problem-solving patterns across different Java applications.