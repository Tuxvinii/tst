package com.werum.hibtst;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="LastName")
	private String lastName;

	public Employee() {/* Default*/}
	
	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String first_name) {
		this.firstName = first_name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String last_name) {
		this.lastName = last_name;
	}
}
