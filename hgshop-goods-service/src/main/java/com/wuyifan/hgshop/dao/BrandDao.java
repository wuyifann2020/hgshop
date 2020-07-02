package com.wuyifan.hgshop.dao;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wuyifan.hgshop.pojo.Brand;

public interface BrandDao {
	int add(Brand brand);
	int  update(Brand brand);
	int delete(int ids[]);
	List<Brand> list(int page,Brand brand);
	List<Brand> list();
	Brand find(int id);
	Brand findById(int id);
}
