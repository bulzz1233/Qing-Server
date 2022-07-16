package com.qing.qingboot.handler;

import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.req.UpdateLikesReq;
import com.qing.qingboot.bean.req.UpdatePlanReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.LikesVO;
import com.qing.qingboot.service.LikesService;
import com.qing.qingboot.service.SportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/likes")
public class LikesHander {
    @Resource
    private LikesService likesService;

    @PostMapping("/userlikes")
    public Result<String> updateBySid(@RequestBody UpdateLikesReq updateLikesReq){
        if(updateLikesReq == null){
            return Result.buildFailure("id不存在，修改失败");
        }
        likesService.updateBySid(updateLikesReq);
        return Result.buildSuccess("更新成功");
    }
    //通过id查询收藏
    @PostMapping("/LikesSelect")
    public Result<List<LikesVO>> LikesSelect(@RequestBody AllFinishReq allFinishReq){
        return likesService.LikesSelect(allFinishReq);
    }
}
