package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class employeeDao {

	Configuration conf;
	SessionFactory ses;
	Session ss;
	Transaction tx;

	
	
	// This is a connect method
	public void connect() { 
		conf = new Configuration().configure().addAnnotatedClass(employee.class)
				.addAnnotatedClass(fresherEmployee.class).addAnnotatedClass(experienceEmployee.class);
		ses = conf.buildSessionFactory();
		ss = ses.openSession();
		tx = ss.beginTransaction();
	}

	
	// This is a method which is use for add employee
	public void addEmployee(employee s) { 
		ss.save(s);
		tx.commit();
		ss.close();
	}

	
	// This is a method which is use for add fresher employee
	public void addEmployee(fresherEmployee f) { 
		ss.save(f);
		tx.commit();
		ss.close();
	}
	
	
	
	
	// This is a method which is use for add Experience employee
	public void addEmployee(experienceEmployee x) { 
		ss.save(x);
		tx.commit();
		ss.close();
	}
	
	
	// This is a method which is use for getDetails of employee
	public employee getDetails(int empId) { 
		employee ep = (employee) ss.load(employee.class, empId);
		tx.commit();
		return ep;
	}
	
	// This is a method which is use for delete employee
	public int deleteEmployee(int empId) { 

		employee ep = (employee) ss.load(employee.class, empId);
		tx.commit();
		return 1;
	}

}
