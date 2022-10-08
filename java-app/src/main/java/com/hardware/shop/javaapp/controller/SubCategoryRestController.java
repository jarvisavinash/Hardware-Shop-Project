package com.hardware.shop.javaapp.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hardware.shop.javaapp.dao.OrdersDAO;
import com.hardware.shop.javaapp.dao.SubCategoryDAO;
import com.hardware.shop.javaapp.model.Orders;
import com.hardware.shop.javaapp.model.SubCategory;

@RestController
@CrossOrigin
@RequestMapping("/subcategory")
public class SubCategoryRestController {

	@Autowired
	SubCategoryDAO subCategoryDAO;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Collection<SubCategory> getAllSubCateroies(){
		
		return subCategoryDAO.getAllSubCategories();
		
	}
	
	@PostMapping(value="/subcategories", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addSubCategory(@RequestBody SubCategory subCategory) {
		
		System.out.println(subCategory);
		subCategoryDAO.addSubCategory(subCategory);
	}
}
