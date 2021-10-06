package com.markjeffrey.productcat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markjeffrey.productcat.models.Product;
import com.markjeffrey.productcat.services.ProductService;

@RestController
@RequestMapping("/api")
public class ApiController {
	@Autowired
	private ProductService pService;
	
	@GetMapping("/")
	public List<Product> index(){
		return this.pService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getOne(@PathVariable("id") Long id) {
		return this.pService.getOneProduct(id);
	}
	
	@PostMapping("/create")
	public Product create(Product product) {
		return this.pService.createProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Long id) {
		this.pService.deleteProduct(id);
	}
}
