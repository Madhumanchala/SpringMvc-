package com.demo.dao;

import java.util.List;

import com.demo.model.Supplier;

public interface SupplierDAO {
	
	public Boolean addSupplier(Supplier supplier);
	public boolean deleteSupplier(Supplier supplier);
	public boolean updateSupplier(Supplier supplier);
	
	public List<Supplier> listSuppliers();
	
	public  Supplier getSupplier(int supplierId);

}
