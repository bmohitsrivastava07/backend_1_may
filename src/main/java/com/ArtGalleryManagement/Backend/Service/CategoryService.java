package com.ArtGalleryManagement.Backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ArtGalleryManagement.Backend.Entity.Category;
import com.ArtGalleryManagement.Backend.Repository.CategoryRepository;

public interface CategoryService {

	public void createCategory(Category category);
	public List<Category> listCategory();
	public void editCategory(int categoryId, Category updateCategory);
	public boolean findById(int categoryId);
}
