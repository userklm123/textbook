package com.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoIndex {
      /**
     * 进入首页index
     * @return
     */
    @GetMapping("/")
    public String login() {
        System.out.println("-----------==============");
        return "index";
    }

    /**
     * 跳转测试页面,转发跳转
     * @return
     */
    @RequestMapping("goTestPage")
    public String goTest(){ return "test"; }
}
