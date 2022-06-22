package com.learning.beans;

import java.util.List;


public class Student {

	private int id;
	private String name;
	private String email;
	private Address address;
	private List<String> subjects;

	public Student(int id, String name, String email, Address address, List<String> subjects) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", subjects="
				+ subjects + "]";
	}

}
