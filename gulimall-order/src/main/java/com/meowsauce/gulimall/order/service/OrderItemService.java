package com.meowsauce.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.meowsauce.common.utils.PageUtils;
import com.meowsauce.gulimall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 21:08:00
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

