package com.qing.qingboot.bean.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data

public class UserAddReq {
    private Long  uid;
    @NotBlank
    private  String userName;
    @NotBlank
    private  String userPassword;
    private String sex;
    private  String tall;
    private String weight;
}
