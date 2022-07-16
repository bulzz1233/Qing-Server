package com.qing.qingboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qing.qingboot.bean.entity.PlanDO;
import com.qing.qingboot.bean.entity.SportDO;
import com.qing.qingboot.bean.req.*;
import com.qing.qingboot.bean.vo.JwtSportVO;
import com.qing.qingboot.bean.vo.PlanVO;

import java.util.List;

public interface PlanMapper extends BaseMapper<PlanDO> {


    List<PlanVO> all(AllPlanReq allPlanReq);

    void delById(DelPlanReq delPlanReq);

    void updateId(UpdatePlanReq updatePlanReq);
}
