package com.qing.qingboot.bean.vo;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@ToString(callSuper = true)
public class PlanVO {

    private String planDate;

    private  Long planId;
    private  Long userId;
    private String planInterval;
    private String planContent;
    private String sportName;
    private String sportType;

    private Boolean planDone;
    private Boolean planReminder;

}
