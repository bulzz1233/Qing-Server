package com.qing.qingboot.bean.req;

import com.qing.qingboot.bean.entity.PlanDO;
import lombok.Data;

import java.util.List;

@Data
public class PlanReq {
    private List <PlanDO> list;

}
