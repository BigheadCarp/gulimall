package com.meowsauce.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.meowsauce.common.utils.PageUtils;
import com.meowsauce.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 21:12:08
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

