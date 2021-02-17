package com.niit.EcommerceBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.model.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements  CategoryDAO{
	
   @Autowired
   private SessionFactory sessionFactory;
	
	private static List <Category> categories = new ArrayList<>();
	
	static {
	Category cat=new Category();
	cat.setId(1);
	cat.setName("Cake");
	cat.setDescription("It is Delicious");
	cat.setImageUrl("1.jpg");
	categories.add(cat);
	
	cat=new Category();
	cat.setId(2);
	cat.setName("Muffin");
	cat.setDescription("It is Cup Muffin");
	cat.setImageUrl("2.jpg");
	categories.add(cat);
	
	cat=new Category();
	cat.setId(3);
	cat.setName("Dark-Chocolate Cake");
	cat.setDescription("It is so Dark and Delicious");
	cat.setImageUrl("3.jpg");
	categories.add(cat);
	
	
	
	
	}
	@Override
	public List<Category> lists() {
		// TODO Auto-generated method stub
		
		return categories;
	}
	@Override
	public Category get(int id) {
		for(Category category:categories)
		{
	
			if(category.getId()==id)
			{
				return category;
		}
	}
		
	
		return null;
	}
	@Override
	public boolean add(Category category) {
		try 
		{
		sessionFactory.getCurrentSession().persist(category);
		return true;
		}
        catch(Exception ex)
        {
        ex.printStackTrace();
        return false;
        }
		
	}

}
