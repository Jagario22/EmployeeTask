package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    private EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity create(@RequestBody Employee employee) {
        employeeService.create(employee);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity update(@RequestBody Employee employee) {
        employeeService.update(employee);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeService.findAll());
    }


    @RequestMapping(value="/{id}")
    @ResponseBody
    @GetMapping
    public ResponseEntity findById(@RequestBody @PathVariable("id") Long id) {
        return ResponseEntity.ok(employeeService.findById(id));
    }


    @RequestMapping(value="/firstName/{first_name}")
    @ResponseBody
    @GetMapping
    public ResponseEntity findAllByFirstName(@RequestBody @PathVariable("first_name") String first_name) {
        return ResponseEntity.ok(employeeService.findAllByFirstName(first_name));
    }


    @RequestMapping(value="/lastName/{last_name}")
    @ResponseBody
    @GetMapping
    public ResponseEntity findAllByLastName(@RequestBody @PathVariable("last_name") String last_name) {
        return ResponseEntity.ok(employeeService.findAllByLastName(last_name));
    }

    @RequestMapping(value="/lastName/{last_name}/firstName/{first_name}")
    @ResponseBody
    @GetMapping
    public ResponseEntity findAllByLastName(@RequestBody @PathVariable("last_name") String last_name, @PathVariable("first_name") String first_name) {
        return ResponseEntity.ok(employeeService.findAllByFirstNameAndLastName(first_name, last_name));
    }

    @RequestMapping(value="/email/{email}")
    @ResponseBody
    @GetMapping
    public ResponseEntity findByEmail(@RequestBody @PathVariable("email") String email) {
        return ResponseEntity.ok(employeeService.findByEmail(email));
    }

}