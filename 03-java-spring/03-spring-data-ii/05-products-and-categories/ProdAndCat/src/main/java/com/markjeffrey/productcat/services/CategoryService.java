package com.markjeffrey.productcat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markjeffrey.productcat.models.Category;
import com.markjeffrey.productcat.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	
	public List<Category> getAllCategories(){
		return this.cRepo.findAll();
	}
	
	public Category getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public Category editCategory(Category category) {
		return this.cRepo.save(category);
	}
	
	public void deleteCategory(Long id) {
		this.cRepo.deleteById(id);
	}
}
