package com.qing.qingboot.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("likes")
public class LikesDO {
    @TableId(type = IdType.AUTO)
    private  Long likesId;
    private  Long userId;
    private Long sid;
}
