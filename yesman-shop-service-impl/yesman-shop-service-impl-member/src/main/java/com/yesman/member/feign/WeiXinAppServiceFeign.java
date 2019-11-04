package com.yesman.member.feign;

import com.yesman.entity.AppEntity;
import com.yesman.weixin.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "app-yesman-weixin")
public interface WeiXinAppServiceFeign extends WeiXinService {

	 /**
	 * 功能说明： 应用服务接口
	 */
	 @GetMapping("/getApp")
	 public AppEntity getApp();
}
