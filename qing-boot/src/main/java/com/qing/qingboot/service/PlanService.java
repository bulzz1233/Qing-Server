package com.qing.qingboot.service;

import com.qing.qingboot.bean.entity.PlanDO;
import com.qing.qingboot.bean.req.AllPlanReq;
import com.qing.qingboot.bean.req.DelPlanReq;
import com.qing.qingboot.bean.req.PlanReq;
import com.qing.qingboot.bean.req.UpdatePlanReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.PlanVO;

import java.util.List;

public interface PlanService {
    void add(PlanDO planDO);


    Result<List<PlanVO>> allPlan(AllPlanReq allPlanReq);

    void  delById(DelPlanReq delPlanReq);

    void updateById(UpdatePlanReq updatePlanReq);
}
