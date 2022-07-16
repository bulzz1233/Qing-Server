package com.qing.qingboot.handler;

import com.qing.qingboot.bean.req.AddFinishReq;
import com.qing.qingboot.bean.req.AllFinishReq;
import com.qing.qingboot.bean.req.UserAddReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.FinishVO;
import com.qing.qingboot.service.FinishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/finish")
public class FinishHander {
    @Resource
    private FinishService finishService;
    //添加打卡
    @PostMapping ("/addFinish")
    public Result<String> add(@RequestBody AddFinishReq addFinishReq){
        finishService.add(addFinishReq);
        return Result.buildSuccess("添加成功");
    }
    //查询所有打卡
    @PostMapping("/all")
    public  Result<List<FinishVO>> allFinish(@RequestBody AllFinishReq allFinishReq){
        return finishService.allFinish(allFinishReq);
    }

}
