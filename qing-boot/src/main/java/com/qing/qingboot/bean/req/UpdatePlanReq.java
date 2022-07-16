package com.qing.qingboot.bean.req;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UpdatePlanReq {
    @NotNull(message = "更新学生信息时，学生id必须指定")
    private Long pid;
    private  Long userId;
    private String planInterval;
    private String planContent;
    private String planDate;
    private Boolean planDone;
    private Boolean planReminder;
}
