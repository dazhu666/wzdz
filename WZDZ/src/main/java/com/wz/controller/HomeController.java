package com.wz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/8/29.
 */

/**
 * 这里不能使用RestController，不然会返回模板类型的页面
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public String home(){
        return "index";
    }
}
