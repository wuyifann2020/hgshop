package com.wuyifan.hgshop.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuyifan.hgshop.dao.BrandDao;
import com.wuyifan.hgshop.pojo.Brand;
import com.wuyifan.hgshop.service.BrankService;

@Service(interfaceClass = BrankService.class)
public class BrandServiceImpl implements BrankService{
	@Autowired
	private BrandDao dao;
	@Override
	public int add(Brand brand) {
		// TODO Auto-generatebd method stub
		return dao.add(brand);
	}

	@Override
	public int update(Brand brand) {
		// TODO Auto-generated method stub
		return dao.update(brand);
	}

	@Override
	public int delete(int[] ids) {
		// TODO Auto-generated method stub
		return dao.delete(ids);
	}

	@Override
	public PageInfo<Brand> list(int page, Brand brand) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, 3);
		List<Brand> list = dao.list(page, brand);
		return new PageInfo<Brand>(list);
	}

	@Override
	public List<Brand> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public Brand find(int id) {
		// TODO Auto-generated method stub
		return dao.find(id);
	}

}
