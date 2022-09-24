package com.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;     //scanner class use for getting input from the user 


public class App 
{
	public static void main( String[] args )           // This is a main method 
	{
   
	 Scanner sc=new Scanner(System.in);                			// Here we create object of Scanner class
	 List<studentBike> bikeList = new ArrayList<studentBike>();
		 List<student> studentList = new ArrayList<student>();
	 int studentId,id,sbike,no;                                // These are instance variable studentId,id,sbike,no
	 String studentName, model, bike;                         // These are instance variable studentName,model,bike
	 String studentStream;                                  // These are instance variable studentStream
	 int studentMarks;                                     // These are instance variable studentMarks
	 studentDao sd=new studentDao();                   // Here we create object of studentDao class
	 student st=new student();                         // Here we create object of student class
	 studentBike sb=new  studentBike();                // Here we create object of bikeStudent class
	
	 int op=0;
	 while(op<4)                                       // Here we create while loop for iterating operations again and again 
	 {
		 System.out.println("PRESS 1. FOR ADD STUDENT \n"
		 		+ "PRESS 2. FOR GET DETAILS OF STUDENT \n"
		 		+ "PRESS 3. FOR DELETE STUDENT\n "
		 		+ "PRESS 4. FOR EXIT");
		 
		 
		 op=sc.nextInt();
		 switch(op)
		 {
		 case 1->{
			 
			 System.out.println("ENTER YOUR ID");             // Here we take input for student's id 
			 studentId=sc.nextInt();                              // Here we student's enter id into instance variable studentId
			 st.setStudentId(studentId);                              // Here we set student's id 
			 sb.setBikeNum(studentId);                            // Here we add student's id on StudentBike class
			 
			 System.out.println("ENTER YOUR NAME");           // Here we take student's name 
			 studentName=sc.next();                               // Here we add student's enter name into instance variable studentName
			 st.setStudentName(studentName);                          // Here we set student's name
			 
			 System.out.println("ENTER YOUR STREAM");         // Here we take student's stream
			 studentStream=sc.next();                              // Here we add student's enter stream into instance variable studentStrem
			 st.setStudentStream(studentStream);                        // Here we set student's stream
			 
			 System.out.println("ENTER YOUR MARKS");          // Here we take student's Marks
			 studentMarks=sc.nextInt();                           // Here we add student's enter marks into instance variable studentMarks
			 st.setStudentMarks(studentMarks);                        // Here we set student's marks
			 
		 System.out.print("ENTER THE NUMBER OF BIKE YOU WANT TO ADD ");
		 no = sc.nextInt();
		 
		 sd.connect();
		 
	  for(int i = 1;i<=no;i++) {                           // Here we perform operations related to add bikes to student 
		   studentBike bk = new studentBike();
		   System.out.println("ENTER YOUR  "+i+"BIKE ID  ");
	       id = sc.nextInt();
		   bk.setBikeNum(id);
		   
		   System.out.println("ENTER  YOUR "+i+"  BIKE COMPANY ");
	       bike = sc.next();
		   bk.setBikeCompany(bike);
		   
		   System.out.println("ENTER  YOUR "+i+"  BIKE MODEL");
		   model = sc.next();
		   bk.setBikeModel(model);
		   
		   System.out.println("ENTER YOUR "+i+"  BIKE ENGINE ");
		   sbike = sc.nextInt();
		   bk.setBikeEngine(sbike);
		   sd.bikeAdd(bk);
		   bikeList.add(bk);
			}
		   st.setL(bikeList);
		   sd.studentAdd(st);
		
	        }
	 case 2->{
		                                                  // Here we perform operations which are related to add student
		 System.out.println("ENTER YOUR ID FOR GETTING INFORMATION");
		 studentId=sc.nextInt();
		 sd.connect();
		 st=sd.getStudent(studentId);
		 System.out.println(st);                          // Here we return student as a output
		 
		
	 }
	 case 3->{                                            // Here we perform operations which are realated to delete student
		 System.out.println("ENTER YOUR ID FOR DELETING THE STUDENT");
		 studentId=sc.nextInt();
		 sd.connect();
		 int delete=sd.deleteStudent(studentId);
		 if(delete==1)                                    // Here we check a condition if student is already present in the database or not
			 System.out.println(" STUDENT DELETED SUCCESSFULLY");
		 else
			 System.out.println(" STUDENT NOT FOUND ");
	 }
	 }
 }
}
}
