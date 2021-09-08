package com.bridgelabz.userregistrationjunit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest 
{

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateFirstName("Padmini");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateFirstName("padmini");
		Assert.assertFalse(isInvalid);
		
	}
	
	@Test
	public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateFirstName("Pa");
		Assert.assertFalse(isInvalid);
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateLastName("Sharma");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateLastName("sharma");
		Assert.assertFalse(isInvalid);
		
	}
	
	@Test
	public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateLastName("Sh");
		Assert.assertFalse(isInvalid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateEmail("abc.xyz@gmail.com");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateEmail("abc@.gmail.");
		Assert.assertFalse(isInvalid);
		
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateMobileNumber("91 9485736453");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateMobileNumber("918765432198");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateMobileNumber("85 76");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePassword("padminI$111");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validatePassword("abcde@1");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validatePassword("abcdefghij");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validatePassword("pass%word@w");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validatePassword("abcd#$%5thg");
		Assert.assertFalse(isInvalid);
	}

}
