# Employee Salary by Department

## Overview

This OOP problem-solving exercise was completed in two stages to practice **filtering, accumulation, counting, and average calculation** using an array of objects.

---

## Project Structure

```text
employee_salary_by_department_03/
├── DepartmentEmployee.java
├── DepartmentSalaryCalculator.java
└── DepartmentSalaryApp.java
```

### `DepartmentEmployee.java`

Represents an employee with:

- Employee name
- Department name
- Salary

Uses private fields, getters, setters, and `toString()` to practice **encapsulation**.

### `DepartmentSalaryCalculator.java`

Contains the salary calculation logic.

### `DepartmentSalaryApp.java`

Creates employee objects, stores them in an array, displays them, and calls the calculator.

---

# Version 1 — Total Salary by Department

## Problem

Calculate the **total salary of employees belonging to a specific department**.

For example:

```text
Alex → Engineering → 10,000
John → HR          → 8,000
Jane → Engineering → 12,000
Mike → Management  → 15,000
Sara → Engineering → 11,000
```

For `Engineering`:

```text
10,000 + 12,000 + 11,000 = 33,000
```

### Algorithm

```text
Start totalSalary at 0

Loop through employees

    If employee is not null

        If department matches

            Add salary to totalSalary

Return totalSalary
```

This version taught me the basic **filter + accumulate** pattern.

---

# Version 2 — Average Salary by Department

I then refactored the previous solution to solve a slightly different problem:

> Calculate the **average salary of employees belonging to a specific department**.

For Engineering:

```text
Total Salary = 33,000
Employee Count = 3

Average = 33,000 / 3
        = 11,000
```

### Algorithm

```text
Start totalSalary at 0
Start employeeCount at 0

Loop through employees

    If employee is not null

        If department matches

            Add salary to totalSalary
            Increase employeeCount

If employeeCount > 0

    Return totalSalary / employeeCount

Otherwise

    Return 0
```

---

# Key Difference Between the Two Versions

### Previous Version

```text
Filter
  ↓
Accumulate Salary
  ↓
Return Total
```

### Refactored Version

```text
Filter
  ↓
Accumulate Salary
  ↓
Count Employees
  ↓
Calculate Average
  ↓
Return Result
```

The important addition was:

```java
int employeeCount = 0;
```

and:

```java
employeeCount++;
```

This allowed me to calculate:

```text
Average = Total / Count
```

---

# Important Learning

This exercise helped me understand that a new problem does not always require completely new code.

I reused the previous:

- Array traversal
- `null` checking
- Department filtering
- Salary accumulation

Then I added:

- Employee counting
- Average calculation
- Protection against division by zero

The main problem-solving pattern is:

```text
Array of Objects
       ↓
     Loop
       ↓
  Null Check
       ↓
    Filter
       ↓
  Accumulate
       ↓
    Count
       ↓
  Calculate
       ↓
    Return
```

---

# Concepts Practiced

- Classes and objects
- Encapsulation
- Getters and setters
- Arrays of objects
- `for` loops
- `null` checking
- Object filtering
- String comparison
- Accumulation
- Counting
- Average calculation
- Static methods
- Separation of responsibilities
- Refactoring

---

# Final Result

For the Engineering department:

```text
Alex → 10,000
Jane → 12,000
Sara → 11,000

Total = 33,000
Count = 3
Average = 11,000
```

This exercise strengthened my understanding of **filtering an array of objects and performing calculations only on the objects that match a condition**.