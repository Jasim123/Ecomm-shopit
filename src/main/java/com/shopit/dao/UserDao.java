package com.shopit.dao;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.shopit.model.UserDetail;
@Repository
public interface UserDao 
{
	public void saveorupdate(UserDetail user);
	public List<UserDetail> viewcustomerd(); 
	
}

