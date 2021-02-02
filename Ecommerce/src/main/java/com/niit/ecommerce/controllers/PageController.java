package com.niit.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.EcommerceBackend.dao.CategoryDAO;
import com.niit.EcommerceBackend.model.Category;

@Controller
public class PageController {
	
	@Autowired
	CategoryDAO categoryDAO;
	
@RequestMapping(value= {"/","/home","/index"})
  public ModelAndView index ()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","home" ); 
	mv.addObject("categories",categoryDAO.lists());
	mv.addObject("userClickHome",true);
	return mv;

}
@RequestMapping(value= {"/about"})
public ModelAndView about()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","About Us");
	mv.addObject("categories",categoryDAO.lists());
	mv.addObject("userClickAbout",true);
	
	
	return mv;

}

@RequestMapping(value= {"/show/all/product"})
public ModelAndView myProducts()
{
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Product");
	mv.addObject("categories",categoryDAO.lists());
	mv.addObject("userClickProduct",true);
	
	
	return mv;

}
@RequestMapping(value= {"/show/category/(id)/product"})
public ModelAndView showCategoryProducts(@PathVariable("id")int id)

{
 Category category=null;
category=categoryDAO.get(id);
 ModelAndView mv=new ModelAndView("page");
	mv.addObject("title",category.getName());
	mv.addObject("categories",categoryDAO.lists());
	mv.addObject("category",category);
	mv.addObject("userClickCategoryProduct",true);
	
	
	
	return mv;
}

}
