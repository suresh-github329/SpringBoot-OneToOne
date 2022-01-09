package com.lara;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lara.dto.EmployeeDTO;
import com.lara.entity.Education;
import com.lara.entity.Employee;
import com.lara.entity.Gender;
import com.lara.repository.EducationRepository;
import com.lara.repository.EmployeeRepository;
import com.lara.repository.GenderRepository;

@SpringBootApplication
public class App6Application implements CommandLineRunner{

	@Autowired
	private GenderRepository genderRepository;
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(App6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Gender g1 = new Gender();
		g1.setId(1);
		g1.setName("Male");
		
		Gender g2 = new Gender();
		g2.setId(2);
		g2.setName("FeMale");
		
		genderRepository.saveAll(Arrays.asList(g1,g2));
		
		
		Education e1 = new Education();
		e1.setId(1);
		e1.setName("BE");
		
		Education e2 = new Education();
		e2.setId(2);
		e2.setName("MCA");
		
		Education e3 = new Education();
		e3.setId(3);
		e3.setName("MBA");
		
		educationRepository.saveAll(Arrays.asList(e1,e2,e3));
		
		
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setFirstName("abc");
		emp1.setLastName("xyz");
		emp1.setGenderId(1);
		emp1.setEducationId(2);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFirstName("Swetha");
		emp2.setLastName("xyz");
		emp2.setGenderId(2);
		emp2.setEducationId(3);
		
		employeeRepository.saveAll(Arrays.asList(emp1, emp2));
		
		
		Employee obj = employeeRepository.findById(2).get();
		System.out.println(obj.getId());
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		System.out.println(obj.getGenderId());
		System.out.println(obj.getEducationId());
		
		//joing method
		
//	    EmployeeDTO obj1 = employeeRepository.readEmployeeDTO(2);
//		System.out.println(obj1.getId());
//		System.out.println(obj1.getFirstName());
//		System.out.println(obj1.getLastName());
//		System.out.println(obj1.getGenderName());
//		System.out.println(obj1.getEducationName());
//		
		
		//native query method
		
//		Employee employee = employeeRepository.readEmployee(1);
//		System.out.println(employee.getId());
//		System.out.println(employee.getFirstName());
//		System.out.println(employee.getLastName());
//		System.out.println(employee.getGenderId());
//		System.out.println(employee.getEducationId());
		
		
//		Employee employee1 = employeeRepository.readEmployee("Swetha");
//		System.out.println(employee1.getId());
//		System.out.println(employee1.getFirstName());
//		System.out.println(employee1.getLastName());
//		System.out.println(employee1.getGenderId());
//		System.out.println(employee1.getEducationId());
		
		
//		List<Employee> employee2 = employeeRepository.readEmployeesBasedOnId(5);
//		for(Employee emp : employee2) {
//			System.out.println(emp.getId());
//			System.out.println(emp.getFirstName());
//			System.out.println(emp.getLastName());
//			System.out.println(emp.getGenderId());
//			System.out.println(emp.getEducationId());
//		}
//		
		
//		List<EmployeeDTO> employee3 = employeeRepository.readEmployeeDTOsBasedOnId(2);
//		for(EmployeeDTO emp : employee3) {
//			System.out.println(emp.getId());
//			System.out.println(emp.getFirstName());
//			System.out.println(emp.getLastName());
//			System.out.println(emp.getGenderName());
//			System.out.println(emp.getEducationName());
//		}
		
		
		
		
		
		
	}

}
