package com.sai.spring.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sai.spring.drools.model.Product;
import com.sai.spring.drools.service.ClothStoreService;

@RestController
public class ClothStoreController {
	
	private final ClothStoreService clothStoreService;
	
	@Autowired
	public ClothStoreController(ClothStoreService clothStoreService) {
		this.clothStoreService=clothStoreService;
	}
	
	@RequestMapping(value = "/getDiscount", method = RequestMethod.GET, produces = "application/json")
	public Product getQuestions(@RequestParam(required = true) String type) {

		Product product = new Product();
		product.setType(type);
		clothStoreService.getProductDiscount(product);
		return product;
	}

}
