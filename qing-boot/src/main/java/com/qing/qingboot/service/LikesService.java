package com.qing.qingboot.service;

import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.req.UpdateLikesReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.LikesVO;


import java.util.List;

public interface LikesService {
    void updateBySid(UpdateLikesReq updateLikesReq);

    Result<List<LikesVO>> LikesSelect(AllFinishReq allFinishReq);
}
