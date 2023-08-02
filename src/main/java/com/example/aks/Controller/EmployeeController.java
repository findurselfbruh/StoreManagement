package com.example.aks.Controller;

import com.example.aks.Dto.SearchRequest;
import com.example.aks.Entity.Employee;
import com.example.aks.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aks/employee")


public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {

        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("employee with ID " +employeeId + " has been deleted.");
    }

    @PutMapping("/put/{employeeId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long employeeId, @RequestBody Employee updatedEmployee) {
        Employee updatedemployee= employeeService.updateEmployee(employeeId, updatedEmployee);
        return ResponseEntity.ok( updatedEmployee);
    }
    @PostMapping("/search")
    public ResponseEntity<List<Employee>> searchEmployee(@RequestBody  SearchRequest searchRequest) {

        List<Employee> searchResults = employeeService.searchEmployees( "%" + searchRequest.getSearchByName() + "%",
                "%" + searchRequest.getSearchByGmail() + "%");
        if (!searchResults.isEmpty()) {
            return ResponseEntity.ok(searchResults);

        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
