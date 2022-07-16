package com.qing.qingboot.bean.vo;

import com.qing.qingboot.bean.dto.JwtManagerDTO;
import lombok.Data;
import lombok.ToString;
//token视图信息

@Data
@ToString(callSuper = true)
public class JwtSportVO  {
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
