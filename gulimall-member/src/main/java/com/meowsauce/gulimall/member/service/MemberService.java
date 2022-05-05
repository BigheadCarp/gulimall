package com.meowsauce.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.meowsauce.common.utils.PageUtils;
import com.meowsauce.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-05-05 21:03:51
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

