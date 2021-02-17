package com.spring.excep.model;

/*
 * Created to display a Proper Response when exception is thrown
 */
public class ExceptionJsonModel {
	private int errorCode;
	private String errorMessage;

	public ExceptionJsonModel(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
