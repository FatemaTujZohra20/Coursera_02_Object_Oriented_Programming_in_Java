package oop_problem_solving.average_employee_salary_02;

public class EmployeeSalaryApp {
    public static void main(String[] args){
        
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Alex");
        employee1.setDepartment("Engineering");
        employee1.setSalary(10000.00f);
        
        Employee employee2 = new Employee();
        employee2.setEmployeeName("John");
        employee2.setDepartment("HR");
        employee2.setSalary(8000.00f);
        
        Employee employee3 = new Employee();
        employee3.setEmployeeName("Jane");
        employee3.setDepartment("Management");
        employee3.setSalary(6000.00f);
        
        Employee[] employees = new Employee[4];
        
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        
        System.out.println("=============  Employees ================");
        
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                System.out.println(employees[i]);
                System.out.println("--------------------------------------");
            }
        }
        
        float totalAverageSalary =
                EmployeeSalaryCalculator.calculateAverageSalary(employees);
        
        System.out.println("Total Average Salary: "
                            + String.format("%.2f", totalAverageSalary));
        
        
        float engineeringAverage =
                EmployeeSalaryCalculator.calculateAverageSalaryByDepartment(employees, "Engineering");
        
        System.out.println("Engineering Average Salary: " + String.format("%.2f", engineeringAverage));

    }
}
