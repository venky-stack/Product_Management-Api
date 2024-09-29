package com.example.productmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.productmanagement.entities.Product;
import com.example.productmanagement.service.ProductService;

@SpringBootApplication
public class ProductMaganementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(ProductMaganementAppApplication.class, args);
		
		ProductService productService=applicationContext.getBean("productService",ProductService.class);
		
		Product product=new Product();
		product.setProductName("AC");
		product.setCategory("electronic");
		product.setPrice(25000);
		product.setProductCode("IMIMIN");
		
		productService.createProduct(product);
	}

}
