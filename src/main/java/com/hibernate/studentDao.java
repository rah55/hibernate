package com.hibernate;

/* This is a hibernate based java program in which we perform operations like add student, delete student, get details of student and perform OneToMany relationship.
@author rahul */




//these all are the packages we need in this 
import javax.persistence.Query; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class studentDao {


	Configuration conf;  
	SessionFactory sf;
	Session ses;
	Transaction tx;
	public void connect() {                               // This is a connect method to make a connection
		conf=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(studentBike.class);
		sf=conf.buildSessionFactory();
		ses=sf.openSession();
		tx=ses.beginTransaction();
	}
	
	public Session studentAdd(student s)                  // method for adding a student
   {
   	ses.save(s);
   	tx.commit();
   	return ses;
   	
   }
	
	 public Session bikeAdd(studentBike sb) {               // method for add student bike
			ses.save(sb);
			return ses;
		}
	    
	    public student getStudent(int studentId)                  // method for student detail
	    {
	    	student st=(student)ses.load(student.class, studentId);
	    	tx.commit();
	    	return st;
	    	
	    }
	    
	    public int deleteStudent(int studentId)                     //  method which is use for delete student
	    {
	    	Query q=ses.createQuery("delete from student s where s.studentId=: Id").setParameter("Id", studentId); //here we create a query
	    	int count=q.executeUpdate();
	    	return count;
	    }
		
}
