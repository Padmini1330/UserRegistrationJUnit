package com.bridgelabz.userregistrationjunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.userregistrationjunit.EmailException.EmailExceptionType;
import com.bridgelabz.userregistrationjunit.FirstNameException.FirstNameExceptionType;
import com.bridgelabz.userregistrationjunit.LastNameException.LastNameExceptionType;
import com.bridgelabz.userregistrationjunit.MobileNumberException.MobileNumberExceptionType;

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
	
	public boolean validateEmail(String email) throws EmailException
	{
		try
		{
			if(email.length()==0)
				throw new  EmailException(EmailExceptionType.EMAIL_EMPTY, "Enter proper email, Empty message not allowed");
			String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[_+-.]?[a-zA-Z0-9]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
			if(email.matches(emailRegex))
				return true;
			else
				throw new EmailException(EmailExceptionType.EMAIL_INVALID, "Enter proper email");
		}
		catch(NullPointerException e)
		{
			throw new EmailException(EmailExceptionType.EMAIL_NULL, "Enter proper email, Null not allowed");
		}
		
	}
	
	
	
	public boolean validateMobileNumber(String mobileNumber) throws MobileNumberException
	{
		try
		{
			if(mobileNumber.length()==0)
				throw new  MobileNumberException(MobileNumberExceptionType.MOBILENUMBER_EMPTY, "Enter proper Mobile number, Empty message not allowed");
			String mobileNumberRegex = "^[0-9]{2}\\s{1}[0-9]{10}$"; 
			if(mobileNumber.matches(mobileNumberRegex))
				return true;
			else
				throw new MobileNumberException(MobileNumberExceptionType.MOBILENUMBER_INVALID, "Enter proper Mobile number");
		}
		catch(NullPointerException e)
		{
			throw new MobileNumberException(MobileNumberExceptionType.MOBILENUMBER_NULL, "Enter proper Mobile number, Null not allowed");
		}
		
	}
	
	public boolean validatePassword(String password) 
	{

		String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%&?\"]).{8,}$"; 
		return password.matches(passwordRegex);
	}
}




