package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.demo.model.Student;

public class StudentDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	// add student
	public void addStudent(Student std) {
		hibernateTemplate.save(std);
	}

	// get all students
	public List<Student> getallStuden() {
		return hibernateTemplate.loadAll(Student.class);
	}

	//get by id 
	public Student getstdByid(Integer id) {
		Student std = hibernateTemplate.get(Student.class, id);
		return std;
	}
	
	@Transactional
	public void updateStudent(Student std)
	{
		hibernateTemplate.update(std);
	}

	public void deleteStudent(Integer id)
	{
		hibernateTemplate.delete(hibernateTemplate.load(Student.class,id));
	}
}
