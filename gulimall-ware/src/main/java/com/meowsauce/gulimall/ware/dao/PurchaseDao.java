package com.meowsauce.gulimall.ware.dao;

import com.meowsauce.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 21:12:08
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
