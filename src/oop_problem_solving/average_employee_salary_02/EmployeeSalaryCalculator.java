package oop_problem_solving.average_employee_salary_02;

public class EmployeeSalaryCalculator {

    public static float calculateAverageSalary(Employee[] employees){
        
        float totalEmployeeSalary = 0;
        int employeeCount = 0;
        
        for (int i = 0; i < employees.length; i++){
            
            if (employees[i] != null){
                totalEmployeeSalary += employees[i].getSalary();
                employeeCount++;
            }
        }
        
        if (employeeCount > 0){
            return totalEmployeeSalary / employeeCount;
        }
        
        return 0;
    }

}
