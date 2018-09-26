package com.tr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tr.dao.ProductMapper;
import com.tr.domain.Product;

@Service
public class ProductService {
	@Autowired
	private ProductMapper mapper;
	
	public List<Product> queryProducts(){
		return mapper.queryProducts();
	}
	
	public Product queryProduct(String id) {
		return mapper.queryProduct(id);
	}
	
	public int insertProduct(Product product) {
		return mapper.insertProduct(product);
	}
	
	public int deleteProduct(String id) {
		return mapper.deleteProduct(id);
	}
	
	public int updateProduct(Product product) {
		return mapper.updateProduct(product);
	}
}
