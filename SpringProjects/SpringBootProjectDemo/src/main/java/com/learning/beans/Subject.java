package com.learning.beans;

public class Subject {

	private String name;
	private String publication;

	public Subject(String name, String publication) {
		super();
		this.name = name;
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", publication=" + publication + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
}
