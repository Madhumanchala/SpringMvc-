package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FileUploadController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String ShowFileUploadform()
	{
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return "fileupload";	
	}

}
