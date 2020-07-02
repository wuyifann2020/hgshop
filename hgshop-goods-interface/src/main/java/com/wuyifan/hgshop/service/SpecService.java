package com.wuyifan.hgshop.service;

import com.wuyifan.hgshop.pojo.Spec;

import java.util.List;

import com.github.pagehelper.PageInfo;

public interface SpecService {
	
	//添加
	int add(Spec spec);
	
	//删除
	int delete(int[] ids);
	
	//修改
	int update(Spec spec);
	
	//列表
	PageInfo<Spec> list(int pageNum,int pageSize,Spec spec);
	
	//
	Spec getById(int id);

	List<Spec> listAll();
	
}
