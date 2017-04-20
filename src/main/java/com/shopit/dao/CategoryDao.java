package com.shopit.dao;

import java.util.List;

import com.shopit.model.Category;
import com.shopit.model.Supplier;

public interface CategoryDao 
{
	public void delete(String id);
	public void saveOrUpdate(Category category) ;
	public void UpRecord(Category category);
	public String  list();
	public Category get(String id);

}

