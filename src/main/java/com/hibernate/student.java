package com.hibernate;


import java.util.List;

import javax.persistence.Entity;                      // Here we import Entity from javax.persistence package
import javax.persistence.Id;                          
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity                           //We use to treat all variable as entity and make a table using these entities
public class student {
	@Id                                               // We use id annotation for create primary key in the table
	private int studentId;                                // This is a private instance variable  studentId
	private String studentName;                           // This is a private instance variable  studentName
	private String studentStream;                          // This is a private instance variable  studentStream
	private int studentMarks;                             // This is a private instance variable  studentMarks
	
	@OneToMany                                        // We use ONETOMANY  annotation for represent oneToMany relation
	@JoinColumn(name = "studentId")                       // Here we join columns 
	private List<studentBike> l;

                                                     
	// These all are getters and setters
 
public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentStream() {
	return studentStream;
}

public void setStudentStream(String studentStream) {
	this.studentStream = studentStream;
}

public int getStudentMarks() {
	return studentMarks;
}

public void setStudentMarks(int studentMarks) {
	this.studentMarks = studentMarks;
}
public List<studentBike> getL() {
	return l;
}

public void setL(List<studentBike> l) {
	this.l = l;
}
@Override
public String toString() {
	return "student [studentId=" + studentId + ", studentName=" + studentName + ", studentStream=" + studentStream
			+ ", studentMarks=" + studentMarks + ", l=" + l + "]";
}





	
}

