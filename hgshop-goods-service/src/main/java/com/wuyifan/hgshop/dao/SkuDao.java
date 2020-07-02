package com.wuyifan.hgshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyifan.hgshop.pojo.Sku;
import com.wuyifan.hgshop.pojo.SkuVo;
import com.wuyifan.hgshop.pojo.SpecOption;

/**
 * sku 的curd
 * @author 45466
 *
 */
public interface SkuDao {

	int insert(Sku sku);
	int insertSpecOption(@Param("skuId")  int id, @Param("opt") SpecOption specOption);
	

	int delete(int[] ids);
	int deleteSpecOption(int ...id);

	int update(Sku sku);	

	Sku findById(int id);
	List<Sku> list(SkuVo skuvo);
	List<Sku> ListBySpuId(int spuId);



	

}
