package com.designpattern.behavioralpattern.iteratorpattren;

import java.util.ArrayList;
import java.util.List;

public class MyIterator implements Iterator {

	List<User> userList = new ArrayList<>();
	static int position = 0;

	public MyIterator(List<User> userList) {
		this.userList = userList;
	}

	@Override
	public boolean hasNext() {
		if (position >= userList.size())
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		User user = userList.get(position);
		position += 1;
		return user;
	}

}
