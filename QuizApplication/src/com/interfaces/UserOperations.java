package com.interfaces;

public interface UserOperations {
	
    public void studentRegistration(String firstName,String lastName,String userName,String password,String city,String emailId, String mobileNumber);
	
	boolean studentLogin();
	
	void qustionsList();
	
	void storeQuizResult();
	
	void displayQuizResult();
	

}
