package com.qing.qingboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qing.qingboot.bean.entity.FinishDO;
import com.qing.qingboot.bean.entity.UserDO;
import com.qing.qingboot.bean.req.AddFinishReq;
import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.FinishVO;
import com.qing.qingboot.bean.vo.PlanVO;
import com.qing.qingboot.ex.BizEx;
import com.qing.qingboot.mapper.FinishMapper;
import com.qing.qingboot.service.FinishService;
import com.qing.qingboot.util.PagerUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FinishServiceImpl implements FinishService {
    @Resource
    private FinishMapper finishMapper;
    @Override
    public void add(AddFinishReq addFinishReq) {
        LambdaQueryWrapper<FinishDO> qw = new LambdaQueryWrapper<>();
        qw.eq(FinishDO::getUserId,addFinishReq.getUserId())
        .eq(FinishDO::getFinishDate,addFinishReq.getFinishDate());
        Long count=finishMapper.selectCount(qw);
        if(count>0){
            throw new BizEx("该用户名已被使用");

        }
        FinishDO finishDO = new FinishDO();
        BeanUtils.copyProperties(addFinishReq,finishDO);
        finishMapper.insert(finishDO);
    }

    @Override
    public Result<List<FinishVO>> allFinish(AllFinishReq allFinishReq) {
        PagerUtil.startPage(1,300);
        List<FinishVO> list =finishMapper.all(allFinishReq);
        return PagerUtil.wrapPageData(list);
    }
}
