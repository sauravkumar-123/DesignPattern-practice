package com.designpattern.behavioralpattern.iteratorpattren;

public class User {

	private int userId;
	private String userName;
	private String emailId;
	private String mobNo;
	private String address;

	public User(int userId, String userName, String emailId, String mobNo, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.mobNo = mobNo;
		this.address = address;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getMobNo() {
		return mobNo;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return this.getUserId() + " " + this.getUserName() + " " + this.getEmailId() + " " + this.getMobNo() + " "
				+ this.getAddress();
	}

}
