package com.qing.qingboot.bean.req;

import lombok.Data;

@Data
public class AddFinishReq {
    private  Long userId;
    private String finishDate;
}
