package com.bridgelabz.userregistrationjunit;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.userregistrationjunit.EmailException.EmailExceptionType;
import com.bridgelabz.userregistrationjunit.FirstNameException.FirstNameExceptionType;
import com.bridgelabz.userregistrationjunit.LastNameException.LastNameExceptionType;
import com.bridgelabz.userregistrationjunit.MobileNumberException.MobileNumberExceptionType;
import com.bridgelabz.userregistrationjunit.PasswordException.PasswordExceptionType;

public class UserRegistrationTest 
{

	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue()    
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName.apply("Padmini");
			Assert.assertTrue(isValid);
		}
		catch(FirstNameException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse()   
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateFirstName.apply("padmini");
			Assert.assertFalse(isInvalid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateFirstName.apply("Pa");
			Assert.assertFalse(isInvalid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldReturnFalse()   
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName.apply(null);
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e) 
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenFirstName_WhenStartsWithSpecialCharacter_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName.apply("%Padmini");
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);

		}
		
		
	}
	
	@Test
	public void givenFirstName_WhenContainsBlankspace_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName.apply("Padmin i");
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_INVALID,e.type);

		}
		
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateFirstName.apply("");
			Assert.assertFalse(isValid);
		}
		catch(FirstNameException e)
		{
			Assert.assertEquals(FirstNameExceptionType.FIRSTNAME_EMPTY,e.type);

		}
		
	}
	
	
	
	
	
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue()    
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName.apply("Sharma");
			Assert.assertTrue(isValid);
		}
		
		catch(LastNameException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse()    
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateLastName.apply("sharma");
			Assert.assertFalse(isInvalid);
		}
		
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse()    
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateLastName.apply("Sh");
			Assert.assertFalse(isInvalid);
		}
		
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenNull_ShouldReturnFalse()    
	{
		
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName.apply(null);
			Assert.assertFalse(isValid);
		}
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenStartsWithSpecialCharacter_ShouldReturnFalse()    
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName.apply("%Padmini");
			Assert.assertFalse(isValid);
		}
		
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenLastName_WhenContainsBlankspace_ShouldReturnFalse()    
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName.apply("Padmin i");
			Assert.assertFalse(isValid);
		}
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_INVALID,e.type);
		}
		
		
	}
	
	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse()    
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateLastName.apply("");
			Assert.assertFalse(isValid);
		}
		catch(LastNameException e)
		{
			Assert.assertEquals(LastNameExceptionType.LASTNAME_EMPTY,e.type);
		}
		
	}
	
	
	
	
	
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateEmail.apply("abc.xyz@gmail.com");
			Assert.assertTrue(isValid);
		}
		catch(EmailException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail.apply("abc@.gmail.");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenNull_ShouldReturnFalse()   
	{
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateEmail.apply(null);
			Assert.assertFalse(isValid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_NULL,e.type);
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenStartsWithSpecialCharacter_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail.apply("$abc@.gmail.");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
		
	}
	
	@Test
	public void givenEmailAddress_WhenDoesNotContainAtTheRateCharacter_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail.apply("abc.gmail.");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
	}	
	
	@Test
	public void givenEmailAddress_WhenEndsWithSpecialCharacter_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail.apply("abc.gmail.com$");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_INVALID,e.type);
		}
	}
	
	@Test
	public void givenEmailAddress_WhenEmpty_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateEmail.apply("");
			Assert.assertFalse(isInvalid);
		}
		catch(EmailException e)
		{
			Assert.assertEquals(EmailExceptionType.EMAIL_EMPTY,e.type);
		}
	}
	
	
	
	
	
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue()  
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateMobileNumber.apply("91 9485736453");
			Assert.assertTrue(isValid);
		}
		
		catch(MobileNumberException e)
		{
			e.printStackTrace();

		}
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse()  
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber.apply("918765432198");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenNull_ShouldReturnFalse()  
	{
		
		try 
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validateMobileNumber.apply(null);
			Assert.assertFalse(isValid);
		}
		catch(MobileNumberException e) 
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_NULL,e.type);
		}
	}
	
	@Test
	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse()  
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber.apply("85 76");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenContainsAlphabets_ShouldReturnFalse()  
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber.apply("85 abc76defg");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenContainsMoreThanTenDigits_ShouldReturnFalse()  
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber.apply("91 98765432198765");
			Assert.assertFalse(isInvalid);
		}
		catch(MobileNumberException e)
		{
			Assert.assertEquals(MobileNumberExceptionType.MOBILENUMBER_INVALID,e.type);

		}
	}
	
	@Test
	public void givenMobileNumber_WhenEmpty_ShouldReturnFalse()  
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validateMobileNumber.apply("");
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
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isValid = userRegistration.validatePassword("padminI$111");
			Assert.assertTrue(isValid);
		}
		catch(PasswordException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validatePassword("abcde@1");
			Assert.assertFalse(isInvalid);
		}
		catch(PasswordException e)
		{
			Assert.assertEquals(PasswordExceptionType.PASSWORD_INVALID,e.type);

		}
		
		
	}
	
	@Test
	public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validatePassword("abcd5thg");
			Assert.assertFalse(isInvalid);
		}
		catch(PasswordException e)
		{
			Assert.assertEquals(PasswordExceptionType.PASSWORD_INVALID,e.type);

		}
	}
	
	@Test
	public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse()   
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validatePassword("passWord@w");
			Assert.assertFalse(isInvalid);
		}
		catch(PasswordException e)
		{
			Assert.assertEquals(PasswordExceptionType.PASSWORD_INVALID,e.type);

		}
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
		catch(PasswordException e)
		{
			Assert.assertEquals(PasswordExceptionType.PASSWORD_NULL,e.type);

		}
	}
	
	@Test
	public void givenPassword_WhenContainsNoSpecialCharacter_ShouldReturnFalse()
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validatePassword("abcd5thg");
			Assert.assertFalse(isInvalid);
		}
		catch(PasswordException e)
		{
			Assert.assertEquals(PasswordExceptionType.PASSWORD_INVALID,e.type);

		}
	}
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse()
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validatePassword("abcd#$%5thg");
			Assert.assertFalse(isInvalid);
		}
		catch(PasswordException e)
		{
			Assert.assertEquals(PasswordExceptionType.PASSWORD_INVALID,e.type);

		}
	}
	@Test
	public void givenPassword_WhenEmpty_ShouldReturnFalse() 
	{
		try
		{
			UserRegistration userRegistration = new UserRegistration();
			boolean isInvalid = userRegistration.validatePassword("");
			Assert.assertFalse(isInvalid);
		}
		catch(PasswordException e)
		{
			Assert.assertEquals(PasswordExceptionType.PASSWORD_EMPTY,e.type);

		}
	}

}
