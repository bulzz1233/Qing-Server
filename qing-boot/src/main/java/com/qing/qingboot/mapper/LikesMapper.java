package com.qing.qingboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qing.qingboot.bean.entity.LikesDO;
import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.req.UpdateLikesReq;
import com.qing.qingboot.bean.vo.LikesVO;

import java.util.List;

public interface LikesMapper extends BaseMapper<LikesDO> {
    void delById(UpdateLikesReq updateLikesReq);

    List<LikesVO> LikesSelect(AllFinishReq allFinishReq);
}
