package com.qing.qingboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qing.qingboot.bean.entity.SportDO;
import com.qing.qingboot.bean.req.SearchSportReq;
import com.qing.qingboot.bean.req.SportFitReq;
import com.qing.qingboot.bean.req.SportTypeReq;
import com.qing.qingboot.bean.req.UpdateLikesReq;
import com.qing.qingboot.bean.vo.JwtSportVO;

import java.util.List;

public interface SportsMapper extends BaseMapper<SportDO> {


    List<JwtSportVO> queryList(SearchSportReq searchSportReq);

    List<JwtSportVO> searchType(SportTypeReq sportTypeReq);

    List<JwtSportVO> searchFit(SportFitReq sportFitReq);

    List<JwtSportVO> allSport();

    void updateAdd(UpdateLikesReq updateLikesReq);

    void updateReduce(UpdateLikesReq updateLikesReq);
}
