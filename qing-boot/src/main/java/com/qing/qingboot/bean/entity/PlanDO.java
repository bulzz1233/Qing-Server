package com.qing.qingboot.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@TableName("plan")
public class PlanDO {


    @TableId(type = IdType.AUTO)
    private  Long planId;
    private  Long userId;
    private String planInterval;
    private String sportName;
    private String sportType;


    private String planContent;
    private String planDate;
    private Boolean planDone;
    private Boolean planReminder;

}
