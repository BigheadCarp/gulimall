package com.meowsauce.gulimall.member.feign;

import com.meowsauce.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    //远程服务的url
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
