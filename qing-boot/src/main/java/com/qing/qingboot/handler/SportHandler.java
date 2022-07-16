package com.qing.qingboot.handler;

import com.qing.qingboot.bean.entity.SportDO;
import com.qing.qingboot.bean.req.LoginReq;
import com.qing.qingboot.bean.req.SearchSportReq;
import com.qing.qingboot.bean.req.SportFitReq;
import com.qing.qingboot.bean.req.SportTypeReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.JwtManagerVO;
import com.qing.qingboot.bean.vo.JwtSportVO;
import com.qing.qingboot.service.SportService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//运动接口
@RestController
@RequestMapping("/api/sport")
public class SportHandler {

    @Resource
    private SportService sportService;

    //    通过运动名字查询  {"search":" "}
    @PostMapping("/selectPage")
    public Result<List<JwtSportVO>> selectPage(@RequestBody SearchSportReq searchSportReq) {
//        log.info("login params:{}",searchSportReq);

        return sportService.selectPage(searchSportReq);
    }

    //   通过运动的分类查询运动 {"type":" "}
    @PostMapping("/selectByType")
    public Result<List<JwtSportVO>> selectByType(@RequestBody SportTypeReq sportTypeReq) {
//

        return sportService.selectByType(sportTypeReq);
    }
    //   获得所有运动
    @GetMapping("/allSport")
    public Result<List<JwtSportVO>> allSport() {
//

        return sportService.allSport();
    }
    //    通过运动适合人群查找运动 {"fit":""}
    @PostMapping("/selectByFit")
    public Result<List<JwtSportVO>> selectByFit(@RequestBody SportFitReq sportFitReq) {
//

        return sportService.selectByFit(sportFitReq);
    }
}
