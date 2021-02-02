package com.niit.EcommerceBackend.dao;

import java.util.List;

import com.niit.EcommerceBackend.model.Category;

public interface CategoryDAO {
	
//business logic method
	
	List <Category> lists();
	
	Category get(int id);
}
