package oop_problem_solving.average_employee_salary_02;

public class Employee {
    
    private String employeeName;
    private String department;
    private float salary;
    
    // Setter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }
    
    // Setter for salary
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    // Getter for employee name
    public String getEmployeeName() {
        return this.employeeName;
    }
    
    // Getter for department
    public String getDepartment() {
        return this.department;
    }
    
    // Getter for salary
    public float getSalary() {
        return this.salary;
    }
    
    // Display Employee Information
    @Override
    public String toString() {
        return "Name - " + this.employeeName
                + "\nDepartment - " + this.department
                + "\nSalary - " + String.format("%.2f", this.salary);
    }
}
