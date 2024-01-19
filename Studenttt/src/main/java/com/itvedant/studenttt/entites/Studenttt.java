package com.itvedant.studenttt.entites;

public class Studenttt {
	private Integer id;
	private String name;
	private String email;
	private Integer marks;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
		return "Studenttt [id=" + id + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}
	
}
