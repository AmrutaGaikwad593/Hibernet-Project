package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TeacherGetById {
	
	public static void main(String[] args) {
		TeacherService teacherService=new TeacherService();
		Teacher teacher=teacherService.getTeacherById(2);
		if(teacher!=null) {
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getDept_name());
		}
		else {
			System.out.println("Incorrect Id");
		}
	}

}
