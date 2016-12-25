/*******************************************************************************
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2016年12月25日 下午1:05:51
 *******************************************************************************/


package com.primeton.springbootlesson2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 
 * TODO 服务发现与注册配置
 *
 * @author wangzhao (mailto:wangzhao@primeton.com)
 */
@Component
public class DiscoveryConfig {
    
    //类型（zk或者etcd）
    @Value("${srd.regProtocol}")
    private String regProtocol;
    
    //注册地址
    @Value("${srd.addresses}")
    private String address;

    public String getRegProtocol() {
        return regProtocol;
    }

    public void setRegProtocol(String regProtocol) {
        this.regProtocol = regProtocol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
