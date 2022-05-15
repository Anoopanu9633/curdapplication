package net.javaguides.springboot.springbootcurdrestfulwebservices.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springbootcurdrestfulwebservices.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}