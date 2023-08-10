package com.designpattern.behavioralpattern.iteratorpattren;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

	List<User> userList = new ArrayList<>();

	public void addUser(User user) {
		this.userList.add(user);
	}

	public User getUserbyIndex(int index) {
		return this.userList.get(index);
	}

	public Iterator getIterator() {
		return new MyIterator(userList);
	}
}
