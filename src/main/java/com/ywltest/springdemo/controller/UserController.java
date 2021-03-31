package com.ywltest.springdemo.controller;

import cn.hutool.http.HttpUtil;
import com.ywltest.springdemo.domain.model.User;
import com.ywltest.springdemo.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author yangWenlong
 * @date 2020/12/1- ${time}
 */

@RestController
@RequestMapping("/api/user")
@Api(tags = "查询用户信息")
public class UserController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;

    @PostMapping("/all")
    @ApiOperation("测试")
    public Object restPage(@RequestBody User username) throws Exception {
//        final List<Map<String, Object>> map = jdbcTemplate.queryForList("select * from users");
        //http调用  auth以后为header固定值
        String s = HttpUtil.get("www.baidu.com");

        return  s;
    }
}
