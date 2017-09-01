package com.wz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/8/25.
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @RequestMapping("/login")
    public ResponseEntity<?> login(){
        return new ResponseEntity<Object>("登录", HttpStatus.OK);
    }
}
