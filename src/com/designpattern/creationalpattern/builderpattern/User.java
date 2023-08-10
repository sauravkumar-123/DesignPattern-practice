package com.designpattern.creationalpattern.builderpattern;

public class User {

	private final int userId;
	private final String userName;
	private final String emailId;
	private final String mobNo;
	private final String address;

	private User(UserBuilder userBuilder) {
		this.userId = userBuilder.userId;
		this.userName = userBuilder.userName;
		this.emailId = userBuilder.emailId;
		this.mobNo = userBuilder.mobNo;
		this.address = userBuilder.address;
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

	public static UserBuilder builder() {
		return new UserBuilder();
	}

	static class UserBuilder {

		private int userId;
		private String userName;
		private String emailId;
		private String mobNo;
		private String address;

		public UserBuilder() {

		}

		public UserBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setEmailId(String emailId) {
			this.emailId = emailId;
			return this;
		}

		public UserBuilder setMobNo(String mobNo) {
			this.mobNo = mobNo;
			return this;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			User user = new User(this);
			return user;
		}

	}

}
