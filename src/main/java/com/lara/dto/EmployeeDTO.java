package com.lara.dto;

public class EmployeeDTO {

	
	private Integer id;
	private String firstName;
	private String lastName;
	private String genderName;
	private String educationName;
	
	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(Integer id, String firstName, String lastName, String genderName, String educationName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.genderName = genderName;
		this.educationName = educationName;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGenderName() {
		return genderName;
	}

	public String getEducationName() {
		return educationName;
	}
	
	
}
