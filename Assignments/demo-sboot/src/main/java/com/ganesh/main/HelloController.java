package com.ganesh.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.main.Student;

@RestController
public class HelloController {
	
	@Autowired
	// Student student=new Student();

	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "Hello spring boot application!";
	}
	
	@RequestMapping("/calculator/add/{a}/{b}")
	String add(@PathVariable Long a,@PathVariable Long b )
	{
		return "Addition value is "+((int) (a+b));
		
	}
	@RequestMapping("/calculator/sub/{a}/{b}")
	String sub(@PathVariable Long a,@PathVariable Long b )
	{
		return "SubStracted value is "+((int) (a-b));
		
	}
	@RequestMapping("/calculator/mul/{a}/{b}")
	String mul(@PathVariable Long a,@PathVariable Long b )
	{
		return "Multiplication Value is "+((int) (a*b));
		
	}
	@RequestMapping("/calculator/div/{a}/{b}")
	String div(@PathVariable Long a,@PathVariable Long b )
	{
		return "Division value is "+((int) (a/b));
		
	}
	
	@RequestMapping("/Student/{name}/{marks}")
	String gradeCal(@PathVariable String name, @PathVariable Long marks) {
		 Student student=new Student(name, marks);
		return student.gradeCal(student.getName(), student.getMarks());
	}
	
}
