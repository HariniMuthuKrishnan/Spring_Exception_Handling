package com.spring.excep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student 
{
	@Id
	private int stdId; 
	private String stdName;
	private String stdGrade;
	private int stdTotal;
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdTotal() {
		return stdTotal;
	}
	public void setStdTotal(int stdTotal) {
		this.stdTotal = stdTotal;
	}
	public String getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(String stdGrade) {
		this.stdGrade = stdGrade;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdGrade=" + stdGrade 
				+ ", stdTotal=" + stdTotal + "]";
	}
	
	

	}
