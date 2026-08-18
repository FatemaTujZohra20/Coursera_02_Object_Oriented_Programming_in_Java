package oop_basic_in_java.employee_salary_by_department_03;

public class DepartmentEmployee {
    
    private String employeeName;
    private String departmentName;
    private float salary;
    
    // Setter for employee name
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    // Setter for department name
    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }
    
    // Setter for salary
    public void setSalary(float salary){
        this.salary = salary;
    }
    
    // Getter for Employee name
    public String getEmployeeName(){
        return this.employeeName;
    }
    
    // Getter for department name
    public String getDepartmentName(){
        return this.departmentName;
    }
    
    // Getter for salary
    public float getSalary(){
        return this.salary;
    }
    
    // Display information of employee management according to department
    @Override
    public String toString(){
        return "Employee Name - " + this.employeeName
                + "\nDepartment Name - " + this.departmentName
                + "\nSalary - " + String.format("%.2f", this.salary);
    }
}
