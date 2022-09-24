package com.hibernate;

//Here we import Entity from javax.persistence package
import javax.persistence.Entity;     



	@Entity                                              // We use this annotation for create entity in the table
	public class experienceEmployee extends employee{ // Here we extends employee class for perform inheritance

		
		// These private instance variables
		private int empExperience; 						
		private int empHike; 						

		
		
		// These all are getters and setters
		public int getEmpExperience() { 					
			return empExperience;
		}

		public void setEmpExperience(int empExperience) {
			this.empExperience = empExperience;
		}

		public int getEmpHike() {
			return empHike;
		}

		public void setEmpHike(int empHike) {
			this.empHike = empHike;
		}

		@Override
		// Here we generate toString
		public String toString() { 													
			return "experienceEmployee [empExperience=" + empExperience + ", empHike=" + empHike + "]";
		}

	}

	


