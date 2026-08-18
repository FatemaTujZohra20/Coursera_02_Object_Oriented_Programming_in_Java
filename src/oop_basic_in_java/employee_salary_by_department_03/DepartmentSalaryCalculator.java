package oop_basic_in_java.employee_salary_by_department_03;

public class DepartmentSalaryCalculator {
    
    public static float calculateAverageSalaryByDepartment(DepartmentEmployee[] employees, String department){
        
        float totalSalaryByDepartment = 0;
        int employeeCount = 0;
        
        for(int i = 0; i < employees.length; i++) {
            if(employees[i] != null){
                if (employees[i].getDepartmentName().equals(department)){
                    totalSalaryByDepartment += employees[i].getSalary();
                    employeeCount++;
                }
            }
        }
        
        return totalSalaryByDepartment / employeeCount;
    }
}
