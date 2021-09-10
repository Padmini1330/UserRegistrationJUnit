package com.bridgelabz.userregistrationjunit;

public class EmailException extends Exception
{
	enum EmailExceptionType 
	{
		EMAIL_NULL, EMAIL_EMPTY, EMAIL_INVALID
	}

	EmailExceptionType type;

	public EmailException(EmailExceptionType type ,String message) 
	{
		super(message);
		this.type=type;
	}
}
