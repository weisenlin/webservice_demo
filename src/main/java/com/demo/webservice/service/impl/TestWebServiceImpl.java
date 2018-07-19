package com.demo.webservice.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.demo.webservice.bean.User;
import com.demo.webservice.service.TestWebService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/19 0019
 * 用途：
 * 描述:
 */
@Service("testWebService")
@Transactional
public class TestWebServiceImpl implements TestWebService {
    @Override
    public String show(String name) {
        System.out.println("服务器发生调用");
        return "String name";
    }

    @Override
    public String login(String name, String pwd) {
        User user = new User();
        user.setCreateTime(new Date());
        user.setPassword("1231");
        user.setName("ddd");

        String  json = JSONUtils.toJSONString(user);
        return json;
    }
}
