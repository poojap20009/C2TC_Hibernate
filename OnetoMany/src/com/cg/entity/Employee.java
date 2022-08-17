package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_master")
	
	
	public class Employee implements Serializable{
		private static final long serialVersionUID=1L;
		
		@Id
		private int id;
		private String name;
		private double Salary;
		
		@ManyToOne
		@JoinColumn (name="dept_no")
		private Department department;
		
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
	}
	
	




