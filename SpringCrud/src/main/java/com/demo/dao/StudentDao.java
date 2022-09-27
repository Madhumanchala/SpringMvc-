package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.demo.model.Student;

@Component
public class StudentDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	//add Student
	@Transactional
	public void addStudent(Student std) {
		hibernateTemplate.save(std);
	}
	
	//get all
	@Transactional
	public List<Student> getallStudent() {
		return hibernateTemplate.loadAll(Student.class);

	}
	
	@Transactional
	public Student getbyid(Long id) {
		return hibernateTemplate.get(Student.class, id);
	}
	
	@Transactional
	public void updatestudent(Student std) {
		hibernateTemplate.update(std);
	}
	
	@Transactional
	public void deleteStudent(Long id) {
		hibernateTemplate.delete(hibernateTemplate.load(Student.class, id));
	}
	
}
