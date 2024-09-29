package com.example.productmanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.productmanagement.entities.Product;
import com.example.productmanagement.service.ProductService;

@RestController

public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/create")
	public Product createProdcut(@RequestBody Product product)
	{
		return productService.createProduct(product);
	}
	
	@GetMapping(value="/product/{productId}")
	public Optional<Product> getProductById(@PathVariable("productId") Integer productId)
	{
		return productService.getProductById(productId);
	}
}