package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.model.Product;
import com.shopping.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> getAll() {
		return repository.findAll();
	}

	public void save(Product product) {
		repository.save(product);
	}

	public Product get(String id) {
		return repository.findById(id).get();
	}

	public void delete(String id) {
		repository.deleteById(id);
	}
}
