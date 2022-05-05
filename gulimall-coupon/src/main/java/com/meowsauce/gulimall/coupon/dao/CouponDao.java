package com.meowsauce.gulimall.coupon.dao;

import com.meowsauce.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 20:57:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
