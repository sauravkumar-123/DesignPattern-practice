package com.designpattern.creationalpattern.factorypattern;

public class Constant {

	public enum EmpDesignation {
		WEBDEVELOPER(1, "WebDeveloper"), DATASCIENCE(2, "DataScience"), MLDEVELOPER(3, "MlDeveloper"),
		ANDROIDDEVELOPER(4, "AndroidDeveloper");

		private final Integer id;
		private final String name;

		private EmpDesignation(Integer id, String name) {
			this.id = id;
			this.name = name;
		}

		public Integer getId() {
			return id;
		}

		public String getName() {
			return name;
		}

	}

}
