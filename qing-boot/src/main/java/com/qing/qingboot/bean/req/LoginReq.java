package com.qing.qingboot.bean.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;

//登录需要的请求参数
@Data
public class LoginReq {
    @NotBlank
    private  String userName;
    @NotBlank
    private  String userPassword;
}
