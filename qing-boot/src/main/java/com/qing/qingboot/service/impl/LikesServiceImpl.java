package com.qing.qingboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qing.qingboot.bean.entity.LikesDO;
import com.qing.qingboot.bean.entity.UserDO;
import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.req.UpdateLikesReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.FinishVO;
import com.qing.qingboot.ex.BizEx;
import com.qing.qingboot.mapper.LikesMapper;
import com.qing.qingboot.mapper.SportsMapper;
import com.qing.qingboot.service.LikesService;
import com.qing.qingboot.util.PagerUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.qing.qingboot.bean.vo.LikesVO;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LikesServiceImpl implements LikesService {
    @Resource
    private LikesMapper likesMapper;
    @Resource
    private SportsMapper sportsMapper;
    @Override  //收藏功能的实现 {"userId":"","sid":""}
    public void updateBySid(UpdateLikesReq updateLikesReq) {
        LambdaQueryWrapper<LikesDO> qw = new LambdaQueryWrapper<>();
        qw.eq(LikesDO::getUserId,updateLikesReq.getUserId())
            .eq(LikesDO::getSid,updateLikesReq.getSid());
        Long count=likesMapper.selectCount(qw);
        if(count>0){
            //删除
            likesMapper.delById(updateLikesReq);
            sportsMapper.updateReduce(updateLikesReq);
        }else{
            LikesDO likesDO = new LikesDO();
            BeanUtils.copyProperties(updateLikesReq,likesDO);
            likesMapper.insert(likesDO);
            sportsMapper.updateAdd(updateLikesReq);
        }

    }

    @Override
    public Result<List<LikesVO>> LikesSelect(AllFinishReq allFinishReq) {
        PagerUtil.startPage(1,300);
        List<LikesVO> list =likesMapper.LikesSelect(allFinishReq);
        return PagerUtil.wrapPageData(list);
    }
}
