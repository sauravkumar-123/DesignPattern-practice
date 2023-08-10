package com.designpattern.creationalpattern.abstractfactorypattern;

public class EmployeeFactory {

	public static Employee getAllEmployeeDetail(EmployeeAbstarctFactory employeeAbstarctFactory) {
		return employeeAbstarctFactory.createEmployee();
	}
}
