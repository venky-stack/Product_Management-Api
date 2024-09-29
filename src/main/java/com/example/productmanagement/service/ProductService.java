package com.example.productmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productmanagement.dao.ProductDao;
import com.example.productmanagement.entities.Product;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;
	
	public Product createProduct(Product product)
	{
		return productDao.save(product);
	}
	
	public Optional<Product> getProductById(Integer productId)
	{
		return productDao.findById(productId);
	}
}