package ecommerce.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import eCommerce.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void addCategory(Category category) {
		try {
			System.out.println(category.getCategoryName());

			sessionFactory.getCurrentSession().save(category);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public boolean deleteCategory(Category category) {
		try {

			sessionFactory.getCurrentSession().delete(category);
			return true;

		} catch (Exception e) {

			return false;

		}
	}

	public boolean updateCategory(Category category) {

		try {

			sessionFactory.getCurrentSession().update(category);
			return true;

		} catch (Exception e) {

			return false;

		}
	}

	public List<Category> listCategories() {

		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Category");
		List<Category> listCategories = query.list();

		session.close();
		return listCategories;
	}

	public Category getCategory(int categoryId) {

		Session session = sessionFactory.openSession();

		Category category = session.get(Category.class, categoryId);

		return null;
	}

}
