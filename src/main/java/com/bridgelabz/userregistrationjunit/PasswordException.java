package com.bridgelabz.userregistrationjunit;

public class PasswordException extends Exception
{
	enum PasswordExceptionType 
	{
		PASSWORD_NULL, PASSWORD_EMPTY, PASSWORD_INVALID
	}

	PasswordExceptionType type;

	public PasswordException(PasswordExceptionType type ,String message) 
	{
		super(message);
		this.type=type;
	}
}
