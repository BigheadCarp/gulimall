package com.meowsauce.gulimall.order.dao;

import com.meowsauce.gulimall.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 21:08:00
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
