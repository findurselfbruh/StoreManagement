package com.example.aks.Service;

import com.example.aks.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    void deleteEmployee (long employeeId);

    Employee  updateEmployee (Long employeeId, Employee  updatedEmployee );



    List<Employee> searchEmployees(String name,
                                   String gmail);
}
