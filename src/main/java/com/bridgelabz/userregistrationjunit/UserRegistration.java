package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.userregistrationjunit.FirstNameException.FirstNameExceptionType;
import com.bridgelabz.userregistrationjunit.LastNameException.LastNameExceptionType;

public class UserRegistration 
{
	public boolean validateFirstName(String firstname) throws FirstNameException
	{
		try
		{
			if(firstname.length()==0)
				throw new  FirstNameException(FirstNameExceptionType.FIRSTNAME_EMPTY, "Enter proper First name, Empty message not allowed");
			String firstNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
			if(firstname.matches(firstNameRegex))
				return true;
			else
				throw new FirstNameException(FirstNameExceptionType.FIRSTNAME_INVALID, "Enter proper First name");
		}
		catch(NullPointerException e)
		{
			throw new FirstNameException(FirstNameExceptionType.FIRSTNAME_NULL, "Enter proper First name, Null not allowed");
		}
	}
	
	
	public boolean validateLastName(String lastname) throws LastNameException
	{
		try
		{
			if(lastname.length()==0)
				throw new  LastNameException(LastNameExceptionType.LASTNAME_EMPTY, "Enter proper Last name, Empty message not allowed");
			String lastNameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
			if(lastname.matches(lastNameRegex))
				return true;
			else
				throw new LastNameException(LastNameExceptionType.LASTNAME_INVALID, "Enter proper Last name");
		}
		catch(NullPointerException e)
		{
			throw new LastNameException(LastNameExceptionType.LASTNAME_NULL, "Enter proper Last name, Null not allowed");
		}
	}
	
	public boolean validateEmail(String email) 
	{

		String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[_+-.]?[a-zA-Z0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		return email.matches(emailRegex);
	}
	
	public boolean validateMobileNumber(String mobileNumber) 
	{

		String mobileNumberRegex = "^[0-9]{2}\\s{1}[0-9]{10}$"; 
		return mobileNumber.matches(mobileNumberRegex);
	}
	
	public boolean validatePassword(String password) 
	{

		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%&?\"]).{8,}$"; 
		return password.matches(passwordRegex);
	}
}




