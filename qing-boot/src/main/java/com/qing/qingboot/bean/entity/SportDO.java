package com.qing.qingboot.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
//表示识别后该实体和哪张数据库表对应
@TableName("sport")
public class SportDO {
//    指定主键自增
@TableId(type = IdType.AUTO)
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
