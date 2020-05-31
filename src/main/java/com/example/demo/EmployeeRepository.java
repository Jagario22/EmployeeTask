package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByFirstName(String firstName);

    List<Employee> findAllByLastName(String last_name);

    List<Employee> findAllByFirstNameAndLastName(String first_name, String last_name);

    Employee findByEmail(String email);
}
