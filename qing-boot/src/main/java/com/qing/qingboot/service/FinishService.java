package com.qing.qingboot.service;

import com.qing.qingboot.bean.req.AddFinishReq;
import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.FinishVO;

import java.util.List;

public interface FinishService {
    void add(AddFinishReq addFinishReq);

    Result<List<FinishVO>> allFinish(AllFinishReq allFinishReq);
}
