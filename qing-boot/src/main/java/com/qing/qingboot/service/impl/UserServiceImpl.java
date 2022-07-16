package com.qing.qingboot.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qing.qingboot.bean.dto.JwtManagerDTO;
import com.qing.qingboot.bean.entity.UserDO;
import com.qing.qingboot.bean.req.LoginReq;
import com.qing.qingboot.bean.req.UpdatePlanReq;
import com.qing.qingboot.bean.req.UpdateUserReq;
import com.qing.qingboot.bean.req.UserAddReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.JwtManagerVO;
import com.qing.qingboot.ex.BizEx;
import com.qing.qingboot.mapper.UserMapper;
import com.qing.qingboot.service.UserService;
import com.qing.qingboot.util.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public Result<JwtManagerVO> login(LoginReq loginReq) {
        //        构造查询,查询用户是否存在
        LambdaQueryWrapper<UserDO> qw = new LambdaQueryWrapper<>();
        qw.eq(UserDO::getUserName, loginReq.getUserName())
                .eq(UserDO::getUserPassword, loginReq.getUserPassword());
        UserDO userDO = userMapper.selectOne(qw);
        log.info("result:{}", JSON.toJSONString(userDO));
        if (userDO == null) {
            return Result.buildFailure("用户名或密码不正确");
        }
//        生成token
        JwtManagerVO vo = generateToken(userDO);
        return Result.buildSuccess(vo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void add(UserAddReq userAddReq) {
        LambdaQueryWrapper<UserDO> qw = new LambdaQueryWrapper<>();
        qw.eq(UserDO::getUserName,userAddReq.getUserName());
        Long count=userMapper.selectCount(qw);
        if(count>0){
            throw new BizEx("该用户名已被使用");

        }
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userAddReq,userDO);
        userMapper.insert(userDO);
    }

    //封装生成token函数
    private JwtManagerVO generateToken(UserDO userDO) {
        JwtManagerDTO jwtManagerDTO = new JwtManagerDTO();
//        将userDO实例对象的值复制到jwtManagerDTO里面
        BeanUtils.copyProperties(userDO, jwtManagerDTO);
        String token = JwtUtil.getToken(jwtManagerDTO);
        //给前端返回token+用户信息
        JwtManagerVO vo = new JwtManagerVO();
        BeanUtils.copyProperties(jwtManagerDTO, vo);
        vo.setToken(token);
        return vo;
    }

    @Override
    public void update(UpdateUserReq updateUserReq) {

        userMapper.updateId(updateUserReq);
    }
}
