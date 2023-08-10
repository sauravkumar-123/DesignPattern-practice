package com.designpattern.creationalpattern.factorypattern;

import com.designpattern.creationalpattern.factorypattern.Constant.EmpDesignation;

public class FactoryRun {

	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getAllEmployeeDetail(EmpDesignation.DATASCIENCE);
        if(null!=employee) {
		System.out.println("HashCode "+ employee.hashCode() + " Deatils: " + employee);
        }else {
			throw new RuntimeException("Objet creation fail for employee type:: Invalid Argument Type Value");
		}

	}

}
