package com.ArtGalleryManagement.Backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ArtGalleryManagement.Backend.Entity.Product;
import com.ArtGalleryManagement.Backend.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}
	
	@GetMapping("/product/{productId}")
	public Product getProductsById(@PathVariable("productId") int productId) {
       return this.productService.getProductsById(productId);
	}
    
	@PutMapping("/update/{productId}")
	public void updateProduct(@PathVariable int productId,  @RequestBody Product product){
         this.productService.updateProduct(productId,product);
	}

	@DeleteMapping("/delete/{productId}")
	public Boolean deleteProduct(@PathVariable("productId") int productId) {
         this.productService.deleteProduct(productId);
         return true;
	}

	@PostMapping("/save")
	public void createProduct(@RequestBody Product product) {
        this.productService.createProduct(product);
	}

}

