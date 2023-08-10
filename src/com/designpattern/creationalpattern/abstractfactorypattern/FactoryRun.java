package com.designpattern.creationalpattern.abstractfactorypattern;

public class FactoryRun {

	public static void main(String[] args) {
		Employee andEmployee = EmployeeFactory.getAllEmployeeDetail(new AndroidDeveloper());
		if (null != andEmployee) {
			System.out.println("HashCode " + andEmployee.hashCode() + " Deatils: " + andEmployee);
		} else {
			throw new RuntimeException("Objet creation fail for employee type:: Invalid Argument Type Value");
		}

		Employee webEmployee = EmployeeFactory.getAllEmployeeDetail(new WebDeveloper());
		if (null != webEmployee) {
			System.out.println("HashCode " + webEmployee.hashCode() + " Deatils: " + webEmployee);
		} else {
			throw new RuntimeException("Objet creation fail for employee type:: Invalid Argument Type Value");
		}

		Employee datascienceEmployee = EmployeeFactory.getAllEmployeeDetail(new DataScienceDeveloper());
		if (null != datascienceEmployee) {
			System.out.println("HashCode " + datascienceEmployee.hashCode() + " Deatils: " + datascienceEmployee);
		} else {
			throw new RuntimeException("Objet creation fail for employee type:: Invalid Argument Type Value");
		}

		Employee mldevEmployee = EmployeeFactory.getAllEmployeeDetail(new MLDeveloper());
		if (null != mldevEmployee) {
			System.out.println("HashCode " + mldevEmployee.hashCode() + " Deatils: " + mldevEmployee);
		} else {
			throw new RuntimeException("Objet creation fail for employee type:: Invalid Argument Type Value");
		}
	}

}
