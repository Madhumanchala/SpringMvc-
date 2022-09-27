package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Student;
import com.demo.service.Studentservice;

@Controller
public class StudentController {

	@Autowired
	Studentservice studentservice;

	@GetMapping("/addstudent")
	public String addstd() {
		return "AddStudent";
	}

	@PostMapping("/inserStudent")
	public String inserStudent(@ModelAttribute("inserStudent") Student std) {
		studentservice.addstudent(std);
		return "redirect:/studentReport";
	}

	@GetMapping("studentReport")
	public String Studentreport(Model m) {
		m.addAttribute("student", studentservice.getallStudent());
		return "StudentReport";
	}
	
		@GetMapping("/EditStudent/{id}")
		public String LoadeditForm(@PathVariable(value="id") Long id,Model m) {
			Student std=studentservice.getbyid(id);
			System.out.println(std);
			m.addAttribute("student", std);
			m.addAttribute("title", "Edit employee");
			return "EditStudent";
		}
	

	@PostMapping("/EditStudent/updateStudent")
	public String updateStd(@ModelAttribute("EditStudent") Student std) {
		
		studentservice.updatestd(std);
		return "redirect:/studentReport";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStd(@PathVariable Long id) {
		studentservice.deletestd(id);
		return "redirect:/studentReport";
	}
	
}
