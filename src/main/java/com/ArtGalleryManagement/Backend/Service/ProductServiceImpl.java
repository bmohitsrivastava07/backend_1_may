package com.ArtGalleryManagement.Backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ArtGalleryManagement.Backend.Entity.Product;
import com.ArtGalleryManagement.Backend.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product getProductsById(int productId) {
		return this.productRepository.findById(productId).get();
	}

	@Override
	public void updateProduct(int productId,Product product) {
		if(this.productRepository.existsById(productId)) {
			product.setProductName(product.getProductName());
			product.setProductDescription(product.getProductDescription());
			product.setProductImage(product.getProductImage());
			product.setProductPrice(product.getProductPrice());
			product.setProductQuantity(product.getProductQuantity());
			product.setProductStatus(product.getProductStatus());
			 productRepository.save(product);	
		}
		else {
			 productRepository.save(product);	
		}
	}

	@Override
	public Boolean deleteProduct(int productId) {
		this.productRepository.deleteById(productId);
		return true;
		
	}

	@Override
	public void createProduct(Product product) {
          productRepository.save(product);		
	}
     
}
