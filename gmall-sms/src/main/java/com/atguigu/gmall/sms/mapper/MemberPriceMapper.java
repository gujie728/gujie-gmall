package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-04-07 20:06:21
 */
@Mapper
public interface MemberPriceMapper extends BaseMapper<MemberPriceEntity> {
	
}
