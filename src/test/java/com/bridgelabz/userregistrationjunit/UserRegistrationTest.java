package com.bridgelabz.userregistrationjunit;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.userregistrationjunit.EmailException.EmailExceptionType;
import com.bridgelabz.userregistrationjunit.FirstNameException.FirstNameExceptionType;
import com.bridgelabz.userregistrationjunit.LastNameException.LastNameExceptionType;
import com.bridgelabz.userregistrationjunit.MobileNumberException.MobileNumberExceptionType;

public class UserRegistrationTest 
{

	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws FirstNameException  
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName("Padmini");
			Assert.assertTrue(isValid);
		}
		catch(FirstNameException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() throws FirstNameException 
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateFirstName("padmini");
			Assert.assertFalse(isInvalid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() throws FirstNameException 
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateFirstName("Pa");
			Assert.assertFalse(isInvalid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldReturnFalse() throws FirstNameException 
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName(null);
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e) 
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenStartsWithSpecialCharacter_ShouldReturnFalse() throws FirstNameException 
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName("%Padmini");
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);

		}
		
		
	}
	
	@Test
	public void givenFirstName_WhenContainsBlankspace_ShouldReturnFalse() throws FirstNameException 
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName("Padmin i");
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);

		}
		
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnFalse() throws FirstNameException 
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName("");
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_EMPTY,e.type);

		}
		
	}
	
	
	
	
	
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws LastNameException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName("Sharma");
			Assert.assertTrue(isValid);
		}
		
		catch(LastNameException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() throws LastNameException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateLastName("sharma");
			Assert.assertFalse(isInvalid);
		}
		
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() throws LastNameException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateLastName("Sh");
			Assert.assertFalse(isInvalid);
		}
		
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenNull_ShouldReturnFalse() throws LastNameException
	{
		
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName(null);
			Assert.assertFalse(isValid);
		}
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenStartsWithSpecialCharacter_ShouldReturnFalse() throws LastNameException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName("%Padmini");
			Assert.assertFalse(isValid);
		}
		
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenContainsBlankspace_ShouldReturnFalse() throws LastNameException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName("Padmin i");
			Assert.assertFalse(isValid);
		}
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
		
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() throws LastNameException
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName("");
			Assert.assertFalse(isValid);
		}
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_EMPTY,e.type);
		}
		
	}
	
	
	
	
	
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() throws EmailException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateEmail("abc.xyz@gmail.com");
			Assert.assertTrue(isValid);
		}
		catch(EmailException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() throws EmailException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail("abc@.gmail.");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnFalse() throws EmailException
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateEmail(null);
			Assert.assertFalse(isValid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenStartsWithSpecialCharacter_ShouldReturnFalse() throws EmailException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail("$abc@.gmail.");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenDoesNotContainAtTheRateCharacter_ShouldReturnFalse() throws EmailException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail("abc.gmail.");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
	}	
	
	@Test
	public void givenEmailAddress_WhenEndsWithSpecialCharacter_ShouldReturnFalse() throws EmailException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail("abc.gmail.com$");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnFalse() throws EmailException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail("");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_EMPTY,e.type);
		}
	}
	
	
	
	
	
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws MobileNumberException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateMobileNumber("91 9485736453");
			Assert.assertTrue(isValid);
		}
		
		catch(MobileNumberException e)
		{
			e.printStackTrace();

		}
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() throws MobileNumberException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber("918765432198");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnFalse() throws MobileNumberException
	{
		
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateMobileNumber(null);
			Assert.assertFalse(isValid);
		}
		catch(MobileNumberException e) 
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_NULL,e.type);
		}
	}
	
	@Test
	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() throws MobileNumberException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber("85 76");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenContainsAlphabets_ShouldReturnFalse() throws MobileNumberException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber("85 abc76defg");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenContainsMoreThanTenDigits_ShouldReturnFalse() throws MobileNumberException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber("91 98765432198765");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() throws MobileNumberException
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber("");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_EMPTY,e.type);

		}
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
