package com.qing.qingboot.bean.vo;

import com.qing.qingboot.bean.dto.JwtManagerDTO;
import lombok.Data;
import lombok.ToString;
//token视图信息

@Data
@ToString(callSuper = true)
public class JwtManagerVO extends JwtManagerDTO {
    private String token;
}
