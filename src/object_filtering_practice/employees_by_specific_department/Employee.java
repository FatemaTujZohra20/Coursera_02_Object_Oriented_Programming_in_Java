package object_filtering_practice.employees_by_specific_department;

public class Employee {
    
    private String employeeName;
    private String departmentName;
    private float salary;
    
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public float getSalary() {
        return this.salary;
    }
    
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public String getEmployeeName() {
        return this.employeeName;
    }
    
    @Override
    public String toString(){
        return "Employee Name: " + this.employeeName
                + "\nDepartment: " + this.departmentName
                + "\nSalary: " + String.format("%.2f", this.salary);
    }
    

}
