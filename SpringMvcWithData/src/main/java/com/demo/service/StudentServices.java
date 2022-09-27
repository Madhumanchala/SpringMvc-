package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentServices {
	
	@Autowired
	StudentDao studentdao;
	
	//add Student
		public void addStd(Student std)
		{
			studentdao.addstudent(std);
		}
		
		//get all Student
		public List<Student> getAllStudent()
		{
			return studentdao.getAllStudent();
		}
		
		
		//get Std by id
		public Student getById(Long id) {
			
			return studentdao.getStdById(id);
		}
		
		
		
		// update Student
		
		public void updateStd(Student std)
		{
			studentdao.updateStd(std);
		}
		
		
		//delete Student 
		
		public void deleteStudent(Long id)
		{
			studentdao.deleteStd(id);
		}

}
