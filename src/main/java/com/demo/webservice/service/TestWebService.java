package com.demo.webservice.service;

import javax.jws.WebService;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/19 0019
 * 用途：
 * 描述:
 */
@WebService
public interface TestWebService {
    String  show(String name);

    /**
     * 登录服务
     * @param name
     * @param pwd
     * @return
     */
    String login(String name, String pwd);
}
