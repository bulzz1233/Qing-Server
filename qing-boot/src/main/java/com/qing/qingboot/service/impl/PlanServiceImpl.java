package com.qing.qingboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qing.qingboot.bean.entity.PlanDO;
import com.qing.qingboot.bean.req.AllPlanReq;
import com.qing.qingboot.bean.req.DelPlanReq;
import com.qing.qingboot.bean.req.PlanReq;
import com.qing.qingboot.bean.req.UpdatePlanReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.JwtSportVO;
import com.qing.qingboot.bean.vo.PlanVO;
import com.qing.qingboot.ex.BizEx;
import com.qing.qingboot.mapper.PlanMapper;
import com.qing.qingboot.service.PlanService;
import com.qing.qingboot.util.PagerUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service


public class PlanServiceImpl implements PlanService {
    @Resource
    private PlanMapper planMapper;
    @Override
    public void add(PlanDO planDO) {
        LambdaQueryWrapper<PlanDO> qw = new LambdaQueryWrapper<>();
        qw.eq(PlanDO::getPlanContent,planDO.getPlanContent())
                .eq(PlanDO::getUserId,planDO.getUserId())
                .eq(PlanDO::getPlanDate,planDO.getPlanDate());
        Long count=planMapper.selectCount(qw);
        if(count>1){
            throw new BizEx("该运动已添加");
        }
        planMapper.insert(planDO);
    }

    @Override
    public Result<List<PlanVO>> allPlan(AllPlanReq allPlanReq) {
        PagerUtil.startPage(1,300);
        List<PlanVO> list =planMapper.all(allPlanReq);
        return PagerUtil.wrapPageData(list);
    }

    @Override
    public void delById(DelPlanReq delPlanReq) {
        planMapper.delById(delPlanReq);
    }

    @Override
    public void updateById(UpdatePlanReq updatePlanReq) {

        planMapper.updateId(updatePlanReq);
    }


}
