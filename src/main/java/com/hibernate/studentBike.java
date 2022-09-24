package com.hibernate;

import javax.persistence.Entity;                   // Here we import Entity from javax.persistence package
import javax.persistence.Id;   


@Entity
public class studentBike {
	@Id                                            // here ID annotation for create primary key in the table
	   private int bikeNum;                            // This is a private instance variable  bikeNum which become column in table
	   private String bikeCompany;                     // This is a private instance variable  bikeCompany which become column in table
	   private String bikeModel;                       // This is a private instance variable  bikeModel which become column in table
	   private int bikeEngine;                         // This is a private instance variable  bikeEngine which become column in table
	                                                 
	   // These are getters and setters for our variables
	 public int getBikeNum() {                         
		return bikeNum;
	    }
	 public void setBikeNum(int bikeNum) {
		this.bikeNum = bikeNum;
	    }
	 public String getBikeCompany() {
		return bikeCompany;
	    }
	 public void setBikeCompany(String bikeCompany) {
		this.bikeCompany = bikeCompany;
	    }
	 public String getBikeModel() {
		return bikeModel;
	    }
	 public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	    }
	 public int getBikeEngine() {
		return bikeEngine;
	    }
	 public void setBikeEngine(int bikeEngine) {
		this.bikeEngine = bikeEngine;
	    }
	   @Override
	 public String toString() {                       // Here we generate toString
		return "bikeStudent [bikeNum=" + bikeNum + ", bikeCompany=" + bikeCompany + ", bikeModel=" + bikeModel
				+ ", bikeEngine=" + bikeEngine + "]";
	    } 

}

