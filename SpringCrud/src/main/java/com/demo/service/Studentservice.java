package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class Studentservice {
	
	@Autowired
	StudentDao studentDao;
	
	//add student
	public void addstudent(Student std) {
		studentDao.addStudent(std);
	}
	
	public List<Student> getallStudent(){
		return studentDao.getallStudent();
	}
	
	//get by id
	public Student getbyid(Long id)
	{
		return studentDao.getbyid(id);
	}
	
	public void updatestd(Student std) {
		 studentDao.updatestudent(std);
	}
	
	public void deletestd(Long id) {
		studentDao.deleteStudent(id);
	}
}
