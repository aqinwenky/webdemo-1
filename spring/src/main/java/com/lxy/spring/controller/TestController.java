package com.lxy.spring.controller;

import com.lxy.spring.comm.ResultData;
import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: liuxinyun
 * @Date: 2017/10/10 15:59
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResultData get(@RequestParam(required = false) String name){
        return ResultData.successed(name);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResultData post(@RequestBody String name){
        return ResultData.successed(name);
    }
}
