package com.designpattern.behavioralpattern.iteratorpattren;

public class Run {

	public static void main(String[] args) {

		User user1 = new User(101, "Saurav097", "saurav.kumar097@gmail.com", "9691098742", "Patna");
		User user2 = new User(101, "rahul012", "rahul.kumar012@gmail.com", "7845201520", "Gaya");
		User user3 = new User(101, "shyam045", "shyam.kishore985@gmail.com", "6598741520", "Chennai");
		User user4 = new User(101, "radhey021", "radhey.krishan012@gmail.com", "9587410254", "Bangalore");
		User user5 = new User(101, "diksha085", "diksha.rai065@gmail.com", "6598741254", "Bhopal");
		User user6 = new User(101, "naresh096", "naresh.puri065@gmail.com", "9874521454", "Indore");

		UserManagement userManagement = new UserManagement();
		userManagement.userList.add(user1);
		userManagement.userList.add(user2);
		userManagement.userList.add(user3);
		userManagement.userList.add(user4);
		userManagement.userList.add(user5);
		userManagement.userList.add(user6);

		Iterator iterator = userManagement.getIterator();
		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user);
		}

	}

}
