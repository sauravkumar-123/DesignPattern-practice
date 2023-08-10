package com.designpattern.creationalpattern.abstractfactorypattern;

import java.util.Objects;

public class DataScienceDeveloper extends EmployeeAbstarctFactory implements Employee {

	private int empId;
	private String name;
	private String role;
	private double salary;
	private String designation;
	private String dept;

	public DataScienceDeveloper() {

	}

	public DataScienceDeveloper(int empId, String name, String role, double salary, String designation, String dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.designation = designation;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataScienceDeveloper other = (DataScienceDeveloper) obj;
		return empId == other.empId;
	}

	@Override
	public String toString() {
		return "DataScienceDev [empId=" + empId + ", name=" + name + ", role=" + role + ", salary=" + salary
				+ ", designation=" + designation + ", dept=" + dept + "]";
	}

	@Override
	public String getAllEmployeeDetails() {
		return toString();
	}

	@Override
	public Employee createEmployee() {
		return new DataScienceDeveloper(65842, "Rahul Kumar", "Fronted Developer", 95322.85, "Software Developer",
				"Healthcare");
	}
}
