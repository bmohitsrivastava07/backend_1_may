package com.ArtGalleryManagement.Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ArtGalleryManagement.Backend.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	

}
