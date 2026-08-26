package object_filtering_practice.employees_by_specific_department;

public class EmployeeDepartmentFilter {
    
    public static Employee[] employeeFilterByDepartment(
            Employee[] employees, String givenDepartment){
        
        int matchingDepartmentCount = 0;
        
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                if(employees[i].getDepartmentName().equals(givenDepartment)){
                    matchingDepartmentCount++;
                }
            }
        }
        
        Employee[] employeeFilterBYGivenDepartment = new Employee[matchingDepartmentCount];
        
        int resultIndex = 0;
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                if(employees[i].getDepartmentName().equals(givenDepartment)){
                    employeeFilterBYGivenDepartment[resultIndex] = employees[i];
                    resultIndex++;
                }
            }
        }
        
        return employeeFilterBYGivenDepartment;
    }
}
