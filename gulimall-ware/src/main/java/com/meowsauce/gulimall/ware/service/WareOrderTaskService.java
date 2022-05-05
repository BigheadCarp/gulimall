package com.meowsauce.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.meowsauce.common.utils.PageUtils;
import com.meowsauce.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 21:12:08
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

