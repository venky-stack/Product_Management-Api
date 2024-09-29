package com.example.productmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.productmanagement.entities.Product;

@Repository
public interface ProductDao extends CrudRepository<Product,Integer>{

}
