package com.qing.qingboot.handler;

import com.qing.qingboot.bean.req.LoginReq;
import com.qing.qingboot.bean.req.UpdateUserReq;
import com.qing.qingboot.bean.req.UserAddReq;
import com.qing.qingboot.bean.vo.JwtManagerVO;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

//用户接口
@RestController
@Slf4j
@RequestMapping("/api/user")
public class UserHandler {
    @Resource
    private UserService userService;
    //用户登录 {"userName":" ","passWord":" "}
    @PostMapping("/login")
    public Result<JwtManagerVO> login(@RequestBody @Validated LoginReq loginReq){
        log.info("login params:{}",loginReq);
        
        return userService.login(loginReq);
    }
    //用户注册 {"userName":" ","passWord":" "}
    @PostMapping("/register")
    public Result<String> add(@RequestBody @Validated UserAddReq userAddReq){
        log.info("login params:{}", userAddReq);
        userService.add(userAddReq);
        return Result.buildSuccess("添加成功");
    }
    @PostMapping("/update")
    public Result<String> update(@RequestBody UpdateUserReq updateUserReq){

        userService.update(updateUserReq);
        return Result.buildSuccess("修改成功");
    }
}
