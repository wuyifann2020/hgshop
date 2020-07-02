package com.wuyifan.hgshop.service;

import com.wuyifan.hgshop.pojo.Sku;
import com.wuyifan.hgshop.pojo.SkuVo;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * sku的管理
 * @author 45466
 *
 */
public interface SkuService {
	
	int add(Sku sku);
	int update(Sku sku);
	int delete(int[] ids);
	
	PageInfo<Sku> list(SkuVo skuvo);
	
	Sku getById(int id);
	List<Sku> listDetailBySpu(int spuId);
	

}
