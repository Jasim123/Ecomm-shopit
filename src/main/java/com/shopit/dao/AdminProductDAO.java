package com.shopit.dao;
import java.util.List;

import com.shopit.model.Category;
import com.shopit.model.AdminProduct;

public interface AdminProductDAO {

	public void adProdSave(AdminProduct adprod);
	public String listAdProd();
	public void deleteAdProd(int apid);
	public void upAdProd(AdminProduct apd);
	public AdminProduct DispRecord(int apid);
	public int sortId();
	public String lisCatWise(String cat);
	
}
