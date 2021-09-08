package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	public boolean validateFirstName(String firstname) {

		String firstNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		return firstname.matches(firstNameRegex);
	}
	

}




