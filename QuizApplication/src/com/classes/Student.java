package com.classes;

public class Student {

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String city;
	private String emailId;
	private String mobileNumber;

	public Student(String firstName, String lastName, String username, String password, String city, String emailId,
			String mobileNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.city = city;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", city=" + city + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + "]";
	}

}
