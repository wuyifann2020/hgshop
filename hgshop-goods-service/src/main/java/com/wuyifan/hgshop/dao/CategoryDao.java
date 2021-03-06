package com.wuyifan.hgshop.dao;

import java.util.List;

import com.wuyifan.hgshop.pojo.Category;

public interface CategoryDao {

	int add(Category category);

	int update(Category category);

	int delete(int id);

	 List<Category> list(int parentId);
	 
}
