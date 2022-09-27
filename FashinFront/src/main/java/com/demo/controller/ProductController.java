package com.demo.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.demo.dao.CategoryDAO;
import com.demo.dao.ProductDAO;
import com.demo.model.Categorys;
import com.demo.model.Product;

@Controller
public class ProductController {

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	ProductDAO productDAO;

	@RequestMapping("/product")
	public String showProduct(Model m) {
		Product product = new Product();
		m.addAttribute(product);

		List<Product> listproduct = productDAO.listProducts();

		m.addAttribute("productList", listproduct);
		m.addAttribute("categoryList", this.getCategories());

		return "product";
	}

	@RequestMapping(value = "InsertProduct", method = RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product") Product product,
			@RequestParam("pimage") MultipartFile filedet, Model m) {
		productDAO.addProduct(product);
		Product product1 = new Product();

		m.addAttribute(product1);
		m.addAttribute("pageInfo", "Manager Product");

		m.addAttribute("categoryList", this.getCategories());

		String Imagepath = "/home/comunus-user33/Desktop/Madhu Practice/FashinFront/src/main/webapp/resources/images/";
		Imagepath = Imagepath + String.valueOf(product.getProductId() + ".jpg");

		File image = new File(Imagepath);
		if (!filedet.isEmpty()) {
			try {

				byte buff[] = filedet.getBytes();
				FileOutputStream fos = new FileOutputStream(image);
				BufferedOutputStream bs = new BufferedOutputStream(fos);
				bs.write(buff);
				bs.close();
			} catch (Exception e) {

				m.addAttribute("errorInfo", "Exception occured during image upload ok :" + e.getMessage());
				// TODO: handle exception
			}

		} else {
			m.addAttribute("errorInfo", "Exception occured during image upload ok");
		}

		List<Product> listproduct = productDAO.listProducts();

		m.addAttribute("productList", listproduct);

		return "product";

	}

	@RequestMapping(value = "UpdateProduct", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product product, Model m) {

		productDAO.updateProduct(product);
		Product product1 = new Product();

		m.addAttribute(product1);
		m.addAttribute("pageInfo", "Manager Product");
		m.addAttribute("categoryList", this.getCategories());

		List<Product> listproduct = productDAO.listProducts();
		m.addAttribute("productList", listproduct);

		return "Product";
	}

	@RequestMapping(value = "/deleteProduc/{productId}")
	public String deleteProduct(@PathVariable("productId") int productId, Model m) {

		Product product = productDAO.getProduct(productId);

		productDAO.deleteProduct(product);
		Product product1 = new Product();

		m.addAttribute(product1);
		m.addAttribute("pageInfo", "Manager Product");
		m.addAttribute("categoryList", this.getCategories());

		List<Product> listproduct = productDAO.listProducts();
		m.addAttribute("productList", listproduct);

		return "Product";
	}

	@RequestMapping(value = "/editProduct/{productId}", method = RequestMethod.POST)
	public String editProduct(@PathVariable("productId") int productId, Model m) {

		Product product = productDAO.getProduct(productId);
		m.addAttribute(product);

		m.addAttribute("pageInfo", "Manager Product");
		m.addAttribute("categoryList", this.getCategories());
		return "UpdateProduct";

	}

	@RequestMapping(value = "/totalProductDisplay/{productId}", method = RequestMethod.POST)
	public String totalProductDisplay(@PathVariable("productId") int productId, Model m) {

		m.addAttribute("pageInfo", "Manager Product");
		Product product = productDAO.getProduct(productId);
		m.addAttribute(product);

		return "TotalProductDisplay";

	}

	public LinkedHashMap<Integer, String> getCategories() {
		List<Categorys> listcategories = categoryDAO.listCategories();
		LinkedHashMap<Integer, String> categoryList = new LinkedHashMap<Integer, String>();
		for (Categorys categorys : listcategories) {
			categoryList.put(categorys.getCategoryId(), categorys.getCategoryName());
		}
		return categoryList;
	}

}
