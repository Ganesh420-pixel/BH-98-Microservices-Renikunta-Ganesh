package com.ganesh.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

//import javax.persistence.Entity;

@Entity
public class Student {
 
	private @Id Long id;
	private String name;
	private Long marks;
	private String grade;
	
	
	public Student() {
		super();
	}
	
	

	public Student(Long id, String name, Long marks, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Long getMarks() {
		return marks;
	}



	public void setMarks(Long marks) {
		this.marks = marks;
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}



	public String gradeCal(Long marks)
	{
		if(marks>=85 && marks<=100)
		{
			return "A";
		}
		else if(marks>=65 && marks <85)
		{
			return "B";
		}
		else if(marks>=40 && marks<65)
		{
			return "C";
		}
		else if(marks<40 && marks>=0)
		{
			return "Failed";
		}
		else
		{
			return "Invalid Marks";
		}
	}	
}
