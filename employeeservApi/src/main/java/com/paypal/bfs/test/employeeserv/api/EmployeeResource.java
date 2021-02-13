package com.paypal.bfs.test.employeeserv.api;

import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Interface for employee resource operations.
 */
@RequestMapping(path = "/v1/bfs/employees")
public interface EmployeeResource {

    /**
     * Retrieves the {@link Employee} resource by id.
     *
     * @param id employee id.
     * @return {@link Employee} resource.
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/JSON"})
    ResponseEntity<Employee> employeeGetById(@PathVariable("id") String id);

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {"application/JSON"}, consumes = {"application/JSON"})
    ResponseEntity<?> addEmployee(@RequestBody Employee employee);
}
