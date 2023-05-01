package com.ArtGalleryManagement.Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ArtGalleryManagement.Backend.Entity.Product;

public interface ProductRepository extends JpaRepository<Product , Integer> {
        
}