package com.qing.qingboot.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("finish")
public class FinishDO {
    @TableId(type = IdType.AUTO)
    private  Long finishId;
    private  Long userId;
    private String finishDate;
}
