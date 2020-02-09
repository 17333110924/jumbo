package com.bby.jumbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xul
 * @Date: 2020/02/09 17:16
 */
@RestController
public class UserController {

    @GetMapping("/user/getinfo/{msg}")
    public String getInfo(@PathVariable("msg") String msg){
      return msg;
    }
}
