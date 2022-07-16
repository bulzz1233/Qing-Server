package com.qing.qingboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qing.qingboot.bean.entity.UserDO;
import com.qing.qingboot.bean.req.UpdateUserReq;

public interface UserMapper extends BaseMapper<UserDO> {
    void updateId(UpdateUserReq updateUserReq);
}
