package com.yesman.member.service.impl;

import com.yesman.entity.AppEntity;
import com.yesman.member.MemberService;
import com.yesman.member.feign.WeiXinAppServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * 
 * @description:会员服务接口实现
 * @author: yesman
 */
@RestController
public class MemberServiceImpl implements MemberService {

	@Autowired
	private WeiXinAppServiceFeign weiXinAppServiceFeign;

	public AppEntity memberInvokeWeixin() {
		return weiXinAppServiceFeign.getApp();
	}

}
