package com.lara.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lara.dto.EmployeeDTO;
import com.lara.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	
	@Query("select new com.lara.dto.EmployeeDTO(emp.id, emp.firstName, emp.lastName, gen.name, educ.name) " +
	       "from Employee emp inner join Gender gen on(emp.genderId = gen.id)" +
			"inner join Education educ on(emp.educationId = educ.id) where emp.id = :id")
	public EmployeeDTO readEmployeeDTO(Integer id);
	
	
	@Query(value="select * from employee where id = :id", nativeQuery = true)
	public Employee readEmployee(Integer id);
	
	
	@Query(value="select * from employee where first_name = :firstName", nativeQuery = true)
	public Employee readEmployee(String firstName);
	
	
	@Query(value="select * from employee where id <= :id", nativeQuery = true)
	public List<Employee> readEmployeesBasedOnId(Integer id);
	
	
	@Query(value="select new com.lara.dto.EmployeeDTO(emp.id, emp.first_name, emp.last_name, gen.name, educ.name) " + 
			"from Employee emp inner join Gender gen on(emp.gender_id = gen.id)" + 
			"inner join Education educ on(emp.education_id = educ.id) where emp.id = :id", nativeQuery = true)
	public List<EmployeeDTO> readEmployeeDTOsBasedOnId(Integer id);
	
	
}
