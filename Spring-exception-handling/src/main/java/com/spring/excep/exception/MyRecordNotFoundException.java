package com.spring.excep.exception;
/*
 * Userdefined Exception
 */
public class MyRecordNotFoundException extends Exception
{
	private static final long serialVersionUID = 1L;

	public MyRecordNotFoundException(String message) {
		super(message);//calls the parent class constructor to display the Message
	}

}
