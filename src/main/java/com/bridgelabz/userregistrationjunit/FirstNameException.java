package com.bridgelabz.userregistrationjunit;

public class FirstNameException extends RuntimeException 
{
	enum FirstNameExceptionType 
	{
		FIRSTNAME_NULL, FIRSTNAME_EMPTY, FIRSTNAME_INVALID
	}

	FirstNameExceptionType type;

	public FirstNameException(FirstNameExceptionType type ,String message) 
	{
		super(message);
		this.type=type;
	}
}
