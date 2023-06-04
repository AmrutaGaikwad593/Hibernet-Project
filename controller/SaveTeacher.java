package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class SaveTeacher {
	
	public static void main(String[] args) {
		
		TeacherService teacherService=new TeacherService();
		
		Teacher teacher=new Teacher();
		teacher.setName("rani");
		teacher.setDept_name("chemistry");
        
		Teacher t=teacherService.saveTeacher(teacher);
		if(t!=null) {
			System.out.println("Teacher Details Save");
		}
	}

}
