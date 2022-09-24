package com.hibernate;

import javax.persistence.Entity; // Here we import Entity from javax.persistence package
import javax.persistence.Id;

@Entity
public class employee {

	@Id          
	// We use this annotation for set primary key in the table
	
	
	// These are private instance variables 
	private int empId;           
	private String empFirstName; 
	private String empLastName; 

	
	
	// These all are getters and setters
	public int getEmpId() { 
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	@Override
	
	// Here we generate toString
	public String toString() { 
		return "employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName + "]";
	}

}
