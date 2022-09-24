package com.hibernate;

//This is a Scanner class
import java.util.Scanner;  

// This is system class
import static java.lang.System.*;                                   
public class employeeMain {
	public static void main(String[] args) {                        // This is a main method 
		
		
		
		  // These are instance variables
		 int empId;                                               
		 int empExperience; 	                                  
		 int empContractPeriod;                             
	     int empIncrement;
	     int empHike;    									
	     String empFirstName;                               
		 String empLastName;                                 		 
		 
		   // Here we create object of employeeFresher class
	     fresherEmployee ef =new fresherEmployee();         
	     
	  // Here we create object of employeeExperience class
	     experienceEmployee ex=new experienceEmployee();  
	     
	  // Here we create object of employee class  
	     employee em=new employee();            
	     
         // Here we create object of employeeDao class
	     employeeDao dao=new employeeDao(); 
	     
         // Here we create object of Scanner class
	     Scanner sc=new Scanner(System.in);           
	     
	     int op=0;
	        // HERE WE CREATE WHILE LOOP FOR ITERATING OPERATIONS AGAIN AND AGAIN  

		 while(op<6)                                       		 {
			 out.println("PRESS 1. FOR ADD EMPLOYEE \n"
			 		+ "PRESS 2. FOR ADD FRESHER EMPLOYE \n"
			 		+ "PRESS 3. FOR ADD EXPERIENCE EMPLOYEE \n"
			 		+ "PRESS 4 . FOR GET EMPLOYEE DETAILS \n"
			 		+ "PRESS 5 . FOR DELETE EMPLOYEE \n"
			 		+ "PRESS 6. FOR EXIT");
			 op=sc.nextInt();
			 switch(op)
			 {
			 case 1->{                                              
				// Here we perform add employee related operations

				 out.println("Enter your Employee Id");            
				 empId=sc.nextInt();                               
				 em.setEmpId(empId);                               
				 out.println("Enter Your First Name");             
				 empFirstName=sc.next();                           
				 em.setEmpFirstName(empFirstName);                 
				 out.println("Enter your Last Name ");             
	 			 empLastName=sc.next();                            
				 em.setEmpLastName(empLastName);                   
				 dao.connect();                                    
				 dao.addEmployee(em);
				 out.println("details save");
			 }
			 
			 case 2->{   
				// Here we perform add Fresher employee related operations
				 dao.connect();
				 out.println("Enter your Employee Id");           
				 empId=sc.nextInt();                              
				 ef.setEmpId(empId);                                
				 out.println("Enter Your First Name");              
				 empFirstName=sc.next();                            
				 ef.setEmpFirstName(empFirstName);                  
				 out.println("Enter your Last Name ");              
	 			 empLastName=sc.next();                             
				 ef.setEmpLastName(empLastName);                    
				 out.println("Enter your contract period ");        
				 empContractPeriod=sc.nextInt();                    
				 ef.setEmpContractPeriod(empContractPeriod);        
				 out.println("Enter your increment ");              
				 empIncrement=sc.nextInt();                         
				 ef.setEmpIncrement(empIncrement);                  
				 dao.addEmployee(ef);
				 
			 }
				 
            case 3->{
            	// Here we perform add Experience employee related operations
				 dao.connect();
				 out.println("Enter your Employee Id");
				 empId=sc.nextInt();
				 ex.setEmpId(empId);
				 out.println("Enter Your First Name");
				 empFirstName=sc.next();
				 ex.setEmpFirstName(empFirstName);
				 out.println("Enter your Last Name ");
	 			 empLastName=sc.next();
				 ex.setEmpLastName(empLastName);
				 out.println("Enter your experience ");
				 empExperience=sc.nextInt();
				 ex.setEmpExperience(empExperience);
				 out.println("Enter your hike  ");
				 empHike=sc.nextInt();
				 ex.setEmpHike(empHike);
				 dao.addEmployee(ex);

			 }
            case 4->{  
                // Here we perform get employee details related operations
              	 
           	 out.println("Enter your id for get employee details ");
           	 empId=sc.nextInt();
   			 dao.connect();
   			 em=dao.getDetails(empId);
   			 out.println(em);
   
            }
            
            case 5->{  
            	 // Here we perform delete employee related operations  
           	 System.out.println("Enter your id for delete employee");
           	 empId=sc.nextInt();
   			 dao.connect();
   			 int delete=dao.deleteEmployee(empId);
   			 if(delete==1) 
   				 out.println("successfully deleted");
   			 else
   				 out.println(" employee not found ");

            }
			 }
			 }
		 }

}
