package com.qing.qingboot.bean.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class PlanDTO {
    private  Long planId;
    private  Long userId;
    private String planInterval;
    private String planContent;
    private String planDate;
    private String sportName;
    private String sportType;

    private Boolean planDone;
    private Boolean planReminder;

}
