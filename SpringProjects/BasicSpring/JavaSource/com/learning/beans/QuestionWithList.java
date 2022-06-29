package com.learning.beans;

import java.util.Set;

public class QuestionWithList {

	private int id;
	private String name;
	private Set<String> answers;

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

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "QuestionWithList [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
	
	
}
