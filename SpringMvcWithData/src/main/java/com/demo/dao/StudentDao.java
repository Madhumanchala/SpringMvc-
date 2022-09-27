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
	
	@Transactional
	public void addstudent(Student std) {
		hibernateTemplate.save(std);
	}

	public List<Student> getAllStudent() {
		return hibernateTemplate.loadAll(Student.class);
	}
	
	//get employee by id
		@Transactional
		public Student getStdById(Long id)
		{
			
			
			Student std= hibernateTemplate.get(Student.class, id);
			return std;
		}
		
		
		//update employee
		
		@Transactional
		public void updateStd(Student std)
		{
			hibernateTemplate.update(std);
		}
		
		
		//delete employee
		@Transactional
		public void deleteStd(Long id)
		{
			hibernateTemplate.delete(hibernateTemplate.load(Student.class, id));
		}


}
