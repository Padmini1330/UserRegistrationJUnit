package com.bridgelabz.userregistrationjunit;

public class LastNameException extends Exception
{
	enum LastNameExceptionType 
	{
		LASTNAME_NULL, LASTNAME_EMPTY, LASTNAME_INVALID
	}

	LastNameExceptionType type;

	public LastNameException(LastNameExceptionType type ,String message) 
	{
		super(message);
		this.type=type;
	}
}
