package com.qing.qingboot.service.impl;

import com.alibaba.druid.sql.PagerUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qing.qingboot.bean.entity.SportDO;
import com.qing.qingboot.bean.entity.UserDO;
import com.qing.qingboot.bean.req.SearchSportReq;
import com.qing.qingboot.bean.req.SportFitReq;
import com.qing.qingboot.bean.req.SportTypeReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.JwtSportVO;
import com.qing.qingboot.mapper.SportsMapper;
import com.qing.qingboot.service.SportService;
import com.qing.qingboot.util.PagerUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SportServiceImpl implements SportService {
    @Resource
    private SportsMapper sportsMapper;
//运动的分页查询
    @Override
    public Result<List<JwtSportVO>> selectPage(SearchSportReq searchSportReq) {
        PagerUtil.startPage(searchSportReq.getPageNow(),searchSportReq.getPageSize());

       List<JwtSportVO> list =sportsMapper.queryList(searchSportReq);
        return PagerUtil.wrapPageData(list);
    }

    @Override
    public Result<List<JwtSportVO>> selectByType(SportTypeReq sportTypeReq) {
        PagerUtil.startPage(sportTypeReq.getPageNow(),sportTypeReq.getPageSize());

        List<JwtSportVO> list =sportsMapper.searchType(sportTypeReq);
        return PagerUtil.wrapPageData(list);

    }

    @Override
    public Result<List<JwtSportVO>> selectByFit(SportFitReq sportFitReq) {
        PagerUtil.startPage(sportFitReq.getPageNow(),sportFitReq.getPageSize());

        List<JwtSportVO> list =sportsMapper.searchFit(sportFitReq);
        return PagerUtil.wrapPageData(list);
    }

    @Override
    public Result<List<JwtSportVO>> allSport() {


        List<JwtSportVO> list =sportsMapper.allSport();
        return PagerUtil.wrapPageData(list);
    }
}
