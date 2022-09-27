package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Student;
import com.demo.service.StudentServices;

@Controller
@RequestMapping
public class StudentController {

	@Autowired
	StudentServices studentservices;

	@GetMapping("addStudent")
	public String addStd() {
		return "AddStudent";

	}

	// save employee form
	@PostMapping("/insertStudent")
	public String insertStudent(@ModelAttribute Student student) {
		studentservices.addStd(student);
		return "StudentReport";
	}

	@GetMapping("studentReport")
	public String lodeStudent(Model m) {
		m.addAttribute("student", studentservices.getAllStudent());
		m.addAttribute("title", "StudentReport");
		return "StudentReport";
	}

	@GetMapping("/editStudent/{id}")
	public String lodeEditForm(@PathVariable("id") Long id, Model m) {
		Student std = studentservices.getById(id);
		System.out.println(std);
		m.addAttribute("Student", std);
		m.addAttribute("title", "Edit Student");
		return "EditStudent";
	}

	@PostMapping("/editStudent/updateStudent")
	public String updateStde(@ModelAttribute("updateStudent") Student std) {
		studentservices.updateStd(std);
		return "StudentReport";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudn(@PathVariable Long id) {
		studentservices.deleteStudent(id);
		return "StudentReport";
	}
}
