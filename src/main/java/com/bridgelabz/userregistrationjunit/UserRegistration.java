package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	public boolean validateFirstName(String firstname) {

		String firstNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		return firstname.matches(firstNameRegex);
	}
	
	public boolean validateLastName(String lastname) {

		String lastNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		return lastname.matches(lastNameRegex);
	}
	
	public boolean validateEmail(String email) {

		String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[_+-.]?[a-zA-Z0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		return email.matches(emailRegex);
	}
	
	
}




