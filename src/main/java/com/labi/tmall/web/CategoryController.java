package com.labi.tmall.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labi.tmall.pojo.Category;
import com.labi.tmall.service.CategoryService;

@RestController
public class CategoryController {
    @Autowired CategoryService categoryService;
    
    @GetMapping(value="/categories")
    public List<Category> list() throws Exception{
    	return categoryService.list();
    }
}
