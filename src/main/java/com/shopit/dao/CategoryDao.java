package com.shopit.dao;

import java.util.List;

import com.shopit.model.Category;
import com.shopit.model.Supplier;

public interface CategoryDao 
{
	public void saveorupdate(Category cat);
	public Category DispRecord(String sid);
	public String listCategory();
	public void updateRecord(Category cat);
	public void delete(String cid);

}

