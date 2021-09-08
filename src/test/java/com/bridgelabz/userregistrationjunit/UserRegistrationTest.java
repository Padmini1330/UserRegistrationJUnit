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
	

}
