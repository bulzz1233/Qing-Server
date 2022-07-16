package com.qing.qingboot.bean.req;

import lombok.Data;

@Data
public class SportFitReq {
    private String fit;
    //    当前查询第几页
    private Integer pageNow = 1;
    //    一页的内容
    private Integer pageSize = 10;
}
