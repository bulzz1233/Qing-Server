package com.qing.qingboot.bean.dto;

import lombok.Data;

//定义了返回给前端的token是由哪些信息生成的
@Data
public class JwtSportDTO {
    private Long  sid;

    private  String sportName;
    private  String sportIntroduce;
    private String sportType;
    //图片
    private String sportPic;
    //视频
    private String sportVideo;
    //    适应人群
    private String sportFit;
    private String sportLikes;
    private Boolean sportStar;

}
