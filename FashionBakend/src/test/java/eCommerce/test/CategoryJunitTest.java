package eCommerce.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import eCommerce.DBConfig.DBConfig;
import eCommerce.model.Category;
import ecommerce.dao.CategoryDAO;

//@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = DBConfig.class)
public class CategoryJunitTest {

	static CategoryDAO categoryDAO;

	public static void executeFirst() {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("eCommerce");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void addCategoryTest() {

		Category category = new Category();
		category.setCategoryId(1);
		category.setCategoryName("T Shirt ");
		category.setCategoryDesc("All Varieties of T Shirt");

		categoryDAO.addCategory(category);
	}
}
