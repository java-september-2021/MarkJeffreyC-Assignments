package com.markjeffrey.productcat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.productcat.models.Category;
import com.markjeffrey.productcat.models.Product;
import com.markjeffrey.productcat.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	public List<Product> getAllProducts(){
		return this.pRepo.findAll();
	}
	
	public Product getOneProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Product editProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public void deleteProduct(Long id) {
		this.pRepo.deleteById(id);
	}
	
	public void addProduct(Category category, Product product) {
		List<Category> addCategory = product.getCategoryProduct();
		addCategory.add(category);
		this.pRepo.save(product);
	}
	
	public void removeProduct(Category category, Product product) {
		List<Category> remCategory = product.getCategoryProduct();
		remCategory.remove(category);
		this.pRepo.save(product);
	}
}
