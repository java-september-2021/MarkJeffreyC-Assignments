package com.markjeffrey.productcat.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.markjeffrey.productcat.models.Category;
import com.markjeffrey.productcat.models.Product;
import com.markjeffrey.productcat.services.CategoryService;
import com.markjeffrey.productcat.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	public ProductService pService;
	@Autowired
	public CategoryService cService;
	
	@GetMapping("/")
	public String home(Model viewModel) {
		if (this.cService.getAllCategories() == null && this.pService.getAllProducts() == null) {
			return "home.jsp";
		}
		viewModel.addAttribute("allProducts", this.pService.getAllProducts());
		viewModel.addAttribute("allCategories", this.cService.getAllCategories());
		return "home.jsp";
	}
	
	@GetMapping("/product/new")
	public String getProduct(@ModelAttribute("product") Product product) {
		return "new_product.jsp";
	}
	
	@PostMapping("/product/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "new_product.jsp";
		}
		this.pService.createProduct(product);
		return "redirect:/";
	}
	
	@GetMapping("/category/new")
	public String getCategory(@ModelAttribute("category") Category category) {
		return "new_category.jsp";
	}
	
	@PostMapping("/category/new")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "new_category.jsp";
		}
		this.cService.createCategory(category);
		return "redirect:/";
	}
	
	@PostMapping("/product/add/{prod_id}")
	public String addProdCat(@PathVariable("prod_id") Long prod_id, @RequestParam("addCategory") Long cat_id) {
		Category cat = this.cService.getOneCategory(cat_id);
		Product prod = this.pService.getOneProduct(prod_id);
		this.pService.addProduct(cat, prod);
		return "redirect:/product/view/" + prod_id;
	}
	
	@PostMapping("/category/add/{cat_id}")
	public String addCatProd(@PathVariable("cat_id") Long cat_id, @RequestParam("addProduct") Long prod_id) {
		Category cat = this.cService.getOneCategory(cat_id);
		Product prod = this.pService.getOneProduct(prod_id);
		this.pService.addProduct(cat, prod);
		return "redirect:/category/view/" + cat_id;
	}
	
	@GetMapping("/product/view/{id}")
	public String viewProduct(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("oneProduct", this.pService.getOneProduct(id));
		viewModel.addAttribute("allCategories", this.cService.getAllCategories());
		return "view_product.jsp";
	}
	
	@GetMapping("/category/view/{id}")
	public String viewCategory(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("oneCategory", this.cService.getOneCategory(id));
		viewModel.addAttribute("allProducts", this.pService.getAllProducts());
		return "view_category.jsp";
	}
}
