package com.example.aks.ServiceImpl;

import com.example.aks.Entity.Employee;
import com.example.aks.Repository.EmployeeRepository;
import com.example.aks.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public Employee updateEmployee(Long employeeId, Employee updatedEmployee) {
        Employee existingEmployee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + employeeId));
        existingEmployee.setEmployeeName(updatedEmployee.getEmployeeName());
        existingEmployee.setEmployeeGmail(updatedEmployee.getEmployeeGmail());

        return employeeRepository.save(existingEmployee);
    }



    @Override
    public List<Employee> searchEmployees(String name,
                                          String gmail) {
        return employeeRepository.findByEmployeeNameLikeIgnoreCaseOrEmployeeGmailLikeIgnoreCase(name,gmail);
    }



}
