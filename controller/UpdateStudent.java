package com.jsp.controller;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

public class UpdateStudent {
	
	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		Student s=studentService.updateStudent(1, "amu", "amu2@gmail.com",1234567891);
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s.getCon_no());
		
	}

}
