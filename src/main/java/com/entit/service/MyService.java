package com.entit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entit.model.Product;
import com.entit.repo.MyRepo;

@Service
public class MyService {

	@Autowired
	private MyRepo repo;
	
	public Integer saveDataInDb(Product p) {
	return repo.save(p).getProductId();
	}

	public List<Product> getAll() {
		return repo.findAll();
	}

}
