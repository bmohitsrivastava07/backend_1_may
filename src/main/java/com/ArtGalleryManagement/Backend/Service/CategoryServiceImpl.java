package com.ArtGalleryManagement.Backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ArtGalleryManagement.Backend.Entity.Category;
import com.ArtGalleryManagement.Backend.Repository.CategoryRepository;

@Service
public class CategoryServiceImpl {
	
/*	public void createCategory(Category category);
	public List<Category> listCategory();
	public void editCategory(int categoryId, Category updateCategory);
	public boolean findById(int categoryId);

}*/
	@Autowired
	CategoryRepository categoryRepository;
	
	public void createCategory(Category category) {
		categoryRepository.save(category);
		
	}
	
	public List<Category> listCategory(){
		return   categoryRepository.findAll();
	}
	
	 public void editCategory(int categoryId, Category updateCategory) {
	        Category category = categoryRepository.getById(categoryId);
	        category.setCategoryName(updateCategory.getCategoryName());
	        category.setDescription(updateCategory.getDescription());
	        category.setCategoryImage(updateCategory.getCategoryImage());
	        categoryRepository.save(category);
	    }

	    public boolean findById(int categoryId) {
	        return categoryRepository.findById(categoryId).isPresent();
	    }
}
