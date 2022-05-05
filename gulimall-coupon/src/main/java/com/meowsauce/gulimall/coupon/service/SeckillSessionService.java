package com.meowsauce.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.meowsauce.common.utils.PageUtils;
import com.meowsauce.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 20:57:22
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

