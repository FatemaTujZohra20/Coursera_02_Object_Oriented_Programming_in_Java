package object_filtering_practice.employees_by_specific_department;

public class EmployeeDepartmentApp {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Alice");
        employee1.setDepartmentName("IT");
        employee1.setSalary(60000.00f);
        
        Employee employee2 = new Employee();
        employee2.setEmployeeName("Bob");
        employee2.setDepartmentName("HR");
        employee2.setSalary(50000.00f);
        
        Employee employee3 = new Employee();
        employee3.setEmployeeName("Charlie");
        employee3.setDepartmentName("IT");
        employee3.setSalary(70000.00f);
        
        Employee employee4 = new Employee();
        employee4.setEmployeeName("David");
        employee4.setDepartmentName("Finance");
        employee4.setSalary(65000.00f);
        
        Employee[] employees = new Employee[5];
        
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = null;
        
        System.out.println("***************  Displaying all Employees ****************");
        
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                System.out.println(employees[i]);
                System.out.println("---------------------------------------------------------");
            }

        }
        
        
        System.out.println("***************  Employee Filter by given department 'Marketing' ****************");
        Employee[] employeeFilterByDepartment =
                EmployeeDepartmentFilter.employeeFilterByDepartment(employees, "Marketing");
        
        if(employeeFilterByDepartment.length == 0){
            System.out.println("No matching employees found!");
        } else {
            for (int i = 0; i < employeeFilterByDepartment.length; i++) {
                System.out.println(employeeFilterByDepartment[i]);
                System.out.println("----------------------------------------------------------------------------------");
            }
        }
    }
}
