package com.wuyifan.hgshop.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wuyifan.hgshop.pojo.Brand;

import net.sf.jsqlparser.statement.update.Update;

public interface BrankService {
	int add(Brand brand);
	int  update(Brand brand);
	int delete(int ids[]);
	PageInfo<Brand> list(int page,Brand brand);
	List<Brand> list();
	Brand find(int id);
}
