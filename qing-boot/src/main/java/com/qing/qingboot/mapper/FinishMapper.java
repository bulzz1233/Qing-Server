package com.qing.qingboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qing.qingboot.bean.entity.FinishDO;
import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.vo.FinishVO;

import java.util.List;

public interface FinishMapper extends BaseMapper<FinishDO> {
    List<FinishVO> all(AllFinishReq allFinishReq);
}
