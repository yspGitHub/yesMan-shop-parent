package com.yesman.service;

import com.yesman.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface WeiXinService {

    @GetMapping("/getApp")
    public AppEntity getApp();
}
