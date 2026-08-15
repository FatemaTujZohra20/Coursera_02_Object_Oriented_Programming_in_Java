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
    
    public static float calculateAverageSalaryByDepartment(Employee[] employees, String department){
        
        float totalEmployeeSalary = 0;
        int totalEmployeeCount = 0;
        
        for(int i = 0; i < employees.length; i++){
            if (employees[i] != null){
                if (employees[i].getDepartment().equals(department)) {
                    totalEmployeeSalary += employees[i].getSalary();
                    totalEmployeeCount++;
                }
            }
        }
        
        if (totalEmployeeCount > 0){
            return totalEmployeeSalary / totalEmployeeCount;
        }
        
        return 0;
        
    }

}
