package com.hibernate;

import javax.persistence.Entity;



	@Entity                                            // We use this annotation for create entity in the table
	public class fresherEmployee extends employee {        // Here we extends employee class for perform inheritance

		
		// These  are private instance variables
		private int empContractPeriod;			 
		private int empIncrement; 			
		
		
		// These all are getters and setters
		public int getEmpContractPeriod() { 	
			return empContractPeriod;
		}

		public void setEmpContractPeriod(int empContractPeriod) {
			this.empContractPeriod = empContractPeriod;
		}

		public int getEmpIncrement() {
			return empIncrement;
		}

		public void setEmpIncrement(int empIncrement) {
			this.empIncrement = empIncrement;
		}

		@Override
		// Here we generate toString
		public String toString() { 
			return "fresherEmployee [empContractPeriod=" + empContractPeriod + ", empIncrement=" + empIncrement + "]";
		}

	}


