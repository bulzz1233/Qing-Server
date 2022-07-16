package com.qing.qingboot.service;

import com.qing.qingboot.bean.entity.SportDO;
import com.qing.qingboot.bean.req.SearchSportReq;
import com.qing.qingboot.bean.req.SportFitReq;
import com.qing.qingboot.bean.req.SportTypeReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.JwtSportVO;

import java.util.List;

public interface SportService {

    Result<List<JwtSportVO>> selectPage(SearchSportReq searchSportReq);

    Result<List<JwtSportVO>> selectByType(SportTypeReq sportTypeReq);

    Result<List<JwtSportVO>> selectByFit(SportFitReq sportFitReq);

    Result<List<JwtSportVO>> allSport();
}
