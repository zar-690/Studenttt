package com.itvedant.studenttt.dao;

public class StudentttDAO {
		
	private String name;
	private String email;
	private Integer marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentttDAO [name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
}
