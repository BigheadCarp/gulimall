package com.meowsauce.gulimall.order.dao;

import com.meowsauce.gulimall.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 21:08:00
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
