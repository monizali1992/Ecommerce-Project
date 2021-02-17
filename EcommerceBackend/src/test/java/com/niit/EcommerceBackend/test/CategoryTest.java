package com.niit.EcommerceBackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.model.Category;

public class CategoryTest {
	
	private static AnnotationConfigApplicationContext ctx;
	
	private static CategoryDAO categoryDAO;
	
	private static Category category;
	
	@BeforeClass
	public static void init()
	{
	 
		ctx=new AnnotationConfigApplicationContext();
		
		ctx.scan("com.niit.EcommerceBackend");
		
		ctx.refresh();
		
		categoryDAO=(CategoryDAO)ctx.getBean("CategoryDAO");
	}
	
	@Test
	public  void testAddCategory() 
	{
		category = new Category();
		category.setId(1);
		category.setName("Cake");
		category.setDescription("This cake is delicious");
		category.setImageUrl("1.jpg");
	
	assertEquals("category added successfully",true,categoryDAO.add(category));
	}
	
}
