package com.meng.controller;

import com.meng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: 孟庆浩
 * @Description:
 * @Date: Created in 17-10-9 下午4:18
 * @Modified By:
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    public String select(){
        return userService.listAll();
    }
}
