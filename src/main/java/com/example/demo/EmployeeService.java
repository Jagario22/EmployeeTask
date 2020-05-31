package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> findAllByFirstName(String firstName) {
        return employeeRepository.findAllByFirstName(firstName);
    }

    public List<Employee> findAllByLastName(String last_name) {
        return employeeRepository.findAllByLastName(last_name);
    }

    public List<Employee> findAllByFirstNameAndLastName(String first_name, String last_name)
    {
        return employeeRepository.findAllByFirstNameAndLastName(first_name, last_name);
    }

    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

}