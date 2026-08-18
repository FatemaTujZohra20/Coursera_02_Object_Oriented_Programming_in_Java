package oop_basic_in_java.employee_salary_by_department_03;

public class DepartmentSalaryApp {
    
    public static void main (String[] args) {
        
        DepartmentEmployee employee1 = new DepartmentEmployee();
        employee1.setEmployeeName("Alex");
        employee1.setDepartmentName("Engineering");
        employee1.setSalary(10000.00f);
        
        DepartmentEmployee employee2 = new DepartmentEmployee();
        employee2.setEmployeeName("John");
        employee2.setDepartmentName("HR");
        employee2.setSalary(8000.00f);
        
        DepartmentEmployee employee3 = new DepartmentEmployee();
        employee3.setEmployeeName("Jane");
        employee3.setDepartmentName("Engineering");
        employee3.setSalary(12000.00f);
        
        DepartmentEmployee employee4 = new DepartmentEmployee();
        employee4.setEmployeeName("Mike");
        employee4.setDepartmentName("Management");
        employee4.setSalary(15000.00f);
        
        DepartmentEmployee employee5 = new DepartmentEmployee();
        employee5.setEmployeeName("Sara");
        employee5.setDepartmentName("Engineering");
        employee5.setSalary(11000.00f);
        
        DepartmentEmployee[] employees = new DepartmentEmployee[6];
        
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = null;
        
        System.out.println("=========== Employees By Department ===========");
        
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                System.out.println(employees[i]);
                System.out.println("--------------------------------");
            }
        }
        
        float totalSalaryByDepartment =
                DepartmentSalaryCalculator.totalSalaryByDepartment(employees, "Engineering");
        
        System.out.println("Total Salary of Employees by Department - " + totalSalaryByDepartment);
        
    }
}
