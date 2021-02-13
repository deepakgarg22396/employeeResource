package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.dto.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for employee resource.
 */
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

    @Override
    public ResponseEntity<Employee> employeeGetById(String id) {

        Employee employee = new Employee();
        employee.setId(Integer.valueOf(id));
        employee.setFirstName("BFS");
        employee.setLastName("Developer");
        employee.setDateOfBirth("22Jan1992");
        Address address = new Address("A", java.util.Optional.of("b"), "c", "d", "e", 1);
        employee.setAddress(address);

        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
