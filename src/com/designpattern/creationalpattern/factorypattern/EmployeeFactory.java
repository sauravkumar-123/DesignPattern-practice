package com.designpattern.creationalpattern.factorypattern;

import com.designpattern.creationalpattern.factorypattern.Constant.EmpDesignation;

public class EmployeeFactory {

	private static String WEBDEVELOPER = EmpDesignation.WEBDEVELOPER.getName();
	private static String DATASCIENCE = EmpDesignation.DATASCIENCE.getName();
	private static String MLDEVELOPER = EmpDesignation.MLDEVELOPER.getName();
	private static String ANDROIDDEVELOPER = EmpDesignation.ANDROIDDEVELOPER.getName();

	public static Employee getAllEmployeeDetail(EmpDesignation keyObjectName) {

		Employee emp;
		switch (keyObjectName) {

		case WEBDEVELOPER:
			emp = new WebDev(27371, "Saurav Kumar", "Backend Engineer", 54300.85, "Senior Software engineer", "IT");
			break;
		case DATASCIENCE:
			emp = new DataScienceDev(65842, "Rahul Kumar", "Fronted Developer", 95322.85, "Software Developer",
					"Healthcare");
			break;
		case MLDEVELOPER:
			emp = new MLDev(74210, "Shivam Shankar", "Cloud Engineer", 85622.05, "Jr Software Engineer", "Banking");
			break;

		case ANDROIDDEVELOPER:
			emp = new AndroidDev(70914, "Raman Kumar Singh", "Android Developer", 95322.85, "Team Lead", "Automotive");
			break;
		default:
			emp = null;
			break;
		}

		return emp;
	}
}
