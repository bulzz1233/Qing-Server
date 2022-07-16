package com.qing.qingboot.bean.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data

public class UpdateUserReq {
    private Long  uid;
    private String sex;
    private  String tall;
    private String weight;
}
