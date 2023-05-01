package com.ArtGalleryManagement.Backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.ArtGalleryManagement.Backend.ApiResponse;
import com.ArtGalleryManagement.Backend.Entity.Category;
import com.ArtGalleryManagement.Backend.Service.CategoryService;

@RestController
/* @RequestMapping("/category") */
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @PostMapping("/create")
    public /*ResponseEntity<ApiResponse>*/ void createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        //return /*new ResponseEntity<>(new ApiResponse(true, "a new category created"), HttpStatus.CREATED);*/
    }

    @GetMapping("/list")
    public List<Category> listCategory() {
        return categoryService.listCategory();
    }

    @PostMapping("/update/{categoryId}")//retun pi response
    public  void  updateCategory(@PathVariable("categoryId") int categoryId, @RequestBody Category category ) {
        System.out.println("category id " + categoryId);
        if (!categoryService.findById(categoryId)) {
//            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "category does not exists"), HttpStatus.NOT_FOUND);
        }
        categoryService.editCategory(categoryId, category);
//        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "category has been updated"), HttpStatus.OK);
    }
}