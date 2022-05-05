package com.meowsauce.gulimall.product.dao;

import com.meowsauce.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 19:48:39
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
