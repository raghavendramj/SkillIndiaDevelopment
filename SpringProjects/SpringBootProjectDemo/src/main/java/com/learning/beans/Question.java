package com.learning.beans;

import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answer> answers;

	public Question(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
	}
}
