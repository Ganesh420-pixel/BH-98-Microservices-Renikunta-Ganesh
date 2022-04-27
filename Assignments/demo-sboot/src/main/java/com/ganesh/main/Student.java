package com.ganesh.main;
//import javax.persistence.Entity;
//@Entity

public class Student {
 
	private String name;
	private Long marks;
	
	public Student() {
		super();
	}
	
	public Student(String name, Long marks) {
		super();
		this.name = name;
		this.marks = marks;
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

	String gradeCal(String name, Long marks)
	{
		if(marks>=90 && marks<=100)
		{
			return name+" is awarded with A Grade";
		}
		else if(marks>=80)
		{
			return name+" is awarded with B Grade";
		}
		else if(marks>=70)
		{
			return name+" is awarded with C Grade";
		}
		else if(marks<=60 && marks>=0)
		{
			return name+" is Failed in Exam";
		}
		else
		{
		return name+" marks are invalid...";
		}
	}


	
}
