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
	public void givenFirstName_WhenNull_ShouldReturnFalse() 
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName(null);
			Assert.assertFalse(isValid);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Enter proper FirstName");
		}
		
	}
	
	@Test
	public void givenFirstName_WhenStartsWithSpecialCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateFirstName("%Padmini");
		Assert.assertFalse(isValid);
		
	}
	
	@Test
	public void givenFirstName_WhenContainsBlankspace_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateFirstName("Padmin i");
		Assert.assertFalse(isValid);
		
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
	public void givenLastName_WhenNull_ShouldReturnFalse() 
	{
		
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName(null);
			Assert.assertFalse(isValid);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Enter proper LastName");
		}
		
	}
	
	@Test
	public void givenLastName_WhenStartsWithSpecialCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateLastName("%Padmini");
		Assert.assertFalse(isValid);
		
	}
	
	@Test
	public void givenLastName_WhenContainsBlankspace_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateLastName("Padmin i");
		Assert.assertFalse(isValid);
		
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
	public void givenEmailAddress_WhenNull_ShouldReturnFalse() 
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateEmail(null);
			Assert.assertFalse(isValid);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Enter proper Email");
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenStartsWithSpecialCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateEmail("$abc@.gmail.");
		Assert.assertFalse(isInvalid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenDoesNotContainAtTheRateCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateEmail("abc.gmail.");
		Assert.assertFalse(isInvalid);
	}	
	
	@Test
	public void givenEmailAddress_WhenEndsWithSpecialCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateEmail("abc.gmail.com$");
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
	public void givenMobileNumber_WhenNull_ShouldReturnFalse() 
	{
		
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateMobileNumber(null);
			Assert.assertFalse(isValid);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Enter proper mobile number");
		}
	}
	
	@Test
	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateMobileNumber("85 76");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenMobileNumber_WhenContainsAlphabets_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateMobileNumber("85 abc76defg");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenMobileNumber_WhenContainsMoreThanTenDigits_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validateMobileNumber("91 98765432198765");
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
		boolean isInvalid = userRegistration.validatePassword("passWord@w");
		Assert.assertFalse(isInvalid);
	}
	
	@Test
	public void givenPassword_WhenNull_ShouldReturnFalse() 
	{
		
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validatePassword(null);
			Assert.assertFalse(isValid);
		}
		catch(NullPointerException e) 
		{
			System.out.println("Enter proper Password");
		}
	}
	
	@Test
	public void givenPassword_WhenContainsNoSpecialCharacter_ShouldReturnFalse() 
	{
		
		UserRegistration userRegistration = new UserRegistration();
		boolean isInvalid = userRegistration.validatePassword("abcd5thg");
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
