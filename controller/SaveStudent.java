package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class SaveStudent {
	
	public static void main(String[] args) {
		
		StudentService studentService=new StudentService();
		
		Student student=new Student();
		student.setName("rani");
		student.setEmail("rani@gmail.com");
		student.setCon_no(1247144546);
		
		Student s=studentService.saveStudent(student);
		if(s!=null) {
			System.out.println("Student save");
		}
	}

}
