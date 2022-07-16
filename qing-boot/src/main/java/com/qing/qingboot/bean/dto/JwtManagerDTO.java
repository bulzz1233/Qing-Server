package com.qing.qingboot.bean.dto;

import lombok.Data;

//定义了返回给前端的token是由哪些信息生成的
@Data
public class JwtManagerDTO {
    private Long uid;
    private String userName;
    private String sex;
    private String weight;
    private String tall;
}
