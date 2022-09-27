package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.dao.CategoryDAO;
import com.demo.model.Categorys;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping(path="/category", method = RequestMethod.GET)
	public String showCategory(Model m) {

		List<Categorys> listofcatg = categoryDAO.listCategories();
		m.addAttribute("ListofCategories", listofcatg);
		m.addAttribute("pageinfo", "AboutUs");

		return "Category";
	}

	@RequestMapping(path = "/AddCategory", method = RequestMethod.POST)
	public String addCategory(Model m, @RequestParam("catName") String CategoryName,
			@RequestParam("catDesc") String CategoryDesc) {
		Categorys category = new Categorys();

		category.setCategoryName(CategoryName);
		category.setCategoryDesc(CategoryDesc);
		categoryDAO.addCategory(category);

		List<Categorys> listofcatg = categoryDAO.listCategories();
		m.addAttribute("ListofCategories", listofcatg);

		m.addAttribute("pageinfo", "Manage Category");
		return "Category";

	}

	@RequestMapping(path = "/UpdateCategory")
	public String updateCategory(Model m, @RequestParam("catId") int categoryId,
			@RequestParam("catName") String CategoryName, @RequestParam("catDesc") String CategoryDesc) {

		System.out.println("are comming here");
		Categorys category = categoryDAO.getCategory(categoryId);
		

		category.setCategoryName(CategoryName);
		category.setCategoryDesc(CategoryDesc);
		categoryDAO.updateCategory(category);
		List<Categorys> listofcatg = categoryDAO.listCategories();
		m.addAttribute("ListofCategories", listofcatg);

		m.addAttribute("pageinfo", "Manage Category");
		return "Category";

	}

	@RequestMapping(value = "/deleteCategory/{categoryId}")
	public String updateCategory(Model m, @PathVariable("categoryId") int categoryId) {
		Categorys category = categoryDAO.getCategory(categoryId);
		categoryDAO.deleteCategory(category);

		List<Categorys> listofcatg = categoryDAO.listCategories();
		m.addAttribute("ListofCategories", listofcatg);
		return "Category";

	}

	@RequestMapping(value = "/editCategory/{categoryId}")
	public String editCategory(Model m, @PathVariable("categoryId") int categoryId) {
		Categorys category = categoryDAO.getCategory(categoryId);

		m.addAttribute("category", category);
		return "UpdateCategory";

	}
}
