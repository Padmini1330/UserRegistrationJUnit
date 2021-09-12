package com.bridgelabz.userregistrationjunit;


public class MobileNumberException extends RuntimeException
{
	enum MobileNumberExceptionType 
	{
		MOBILENUMBER_NULL, MOBILENUMBER_EMPTY, MOBILENUMBER_INVALID
	}

	MobileNumberExceptionType type;

	public MobileNumberException(MobileNumberExceptionType type ,String message) 
	{
		super(message);
		this.type=type;
	}
}
