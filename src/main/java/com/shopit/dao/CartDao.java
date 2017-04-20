package com.shopit.dao;

import java.util.List;

import com.shopit.model.AdminProduct;
import com.shopit.model.Cart;
import com.shopit.model.UserDetail;

public interface CartDao {
	public void insertCart(Cart c1);
	public List<Cart> get(String id);
	public List<AdminProduct> getParticulerProd(int id);
	public List<UserDetail> getUser(String id);
	

}
