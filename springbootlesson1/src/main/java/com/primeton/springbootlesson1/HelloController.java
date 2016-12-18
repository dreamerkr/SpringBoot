/*******************************************************************************
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2016 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2016年12月16日 下午9:04:34
 *******************************************************************************/


package com.primeton.springbootlesson1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * TODO 此处填写 class 信息
 *
 * @author wangzhao (mailto:wangzhao@primeton.com)
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
