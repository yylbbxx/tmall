package com.labi.tmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.labi.tmall.dao.CategoryDAO;
import com.labi.tmall.pojo.Category;

@Service
public class CategoryService {
	@Autowired CategoryDAO categoryDAO;
	
	public List<Category> list(){
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		return categoryDAO.findAll(sort);
	}

}
