package com.demo.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.dao.SupplierDAO;
import com.demo.model.Supplier;


@Repository
@Transactional
@Service
public class SupplierDAOImpl implements SupplierDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public Boolean addSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().save(supplier);
		return true;
	}

	public boolean deleteSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().delete(supplier);

		return true;
	}

	public boolean updateSupplier(Supplier supplier) {
		sessionFactory.getCurrentSession().update(supplier);

		return true;
	}

	public List<Supplier> listSuppliers() {
		Session session = sessionFactory.openSession();
		Query query = (Query) session.createQuery("from supplier");
		List<Supplier> listSupplier = query.list();

		session.close();
		return listSupplier;
	}

	public Supplier getSupplier(int supplierId) {
		Session session = sessionFactory.openSession();

		Supplier supplier = session.get(Supplier.class, supplierId);

		return supplier;
	}

}
