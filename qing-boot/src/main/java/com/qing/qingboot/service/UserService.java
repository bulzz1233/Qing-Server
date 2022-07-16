package com.qing.qingboot.service;

import com.qing.qingboot.bean.req.LoginReq;
import com.qing.qingboot.bean.req.UpdateUserReq;
import com.qing.qingboot.bean.req.UserAddReq;
import com.qing.qingboot.bean.vo.JwtManagerVO;
import com.qing.qingboot.bean.res.Result;

public interface UserService {

    Result<JwtManagerVO> login(LoginReq loginReq);
    void add(UserAddReq userAddReq);
    void update(UpdateUserReq updateUserReq);
}
