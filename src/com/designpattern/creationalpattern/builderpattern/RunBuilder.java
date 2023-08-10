package com.designpattern.creationalpattern.builderpattern;

public class RunBuilder {

	public static void main(String[] args) {
		User user = User.builder().setUserId(100).setUserName("IR098742").setEmailId("krsaurav.097@gmail.com")
				.setMobNo("9691098742").setAddress("Patna").build();

		System.out.println("User details{} " + user.toString());
	}

}
