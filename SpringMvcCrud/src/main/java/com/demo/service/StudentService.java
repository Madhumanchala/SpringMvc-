package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public void addstd(Student std)
	{
		studentDao.addStudent(std);
	}

	public Student getStdbyid(Integer id)
	{
		
	}

}
