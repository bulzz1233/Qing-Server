package com.qing.qingboot.handler;

import com.qing.qingboot.bean.entity.PlanDO;
import com.qing.qingboot.bean.req.AllPlanReq;
import com.qing.qingboot.bean.req.DelPlanReq;
import com.qing.qingboot.bean.req.PlanReq;
import com.qing.qingboot.bean.req.UpdatePlanReq;
import com.qing.qingboot.bean.res.Result;
import com.qing.qingboot.bean.vo.PlanVO;
import com.qing.qingboot.service.PlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/plan")
public class PlanHander {
    @Resource
    private PlanService planService;
    //添加训练 {"list":"[{'userId':'','planInterval':'' ....},{}]"}
    @PostMapping("/add")
    public Result<String>add(@RequestBody @Validated PlanReq planReq){
         for(int i = 0;i<planReq.getList().size();i++){
             System.out.println(planReq.getList().get(i));
             planService.add(planReq.getList().get(i));
         }
        return Result.buildSuccess("添加成功");
    }
    //通过uid查询训练 {"uid":" "}
    @PostMapping("/all")
    public Result<List<PlanVO>> allPlan(@RequestBody AllPlanReq allPlanReq){

        return planService.allPlan(allPlanReq);
    }
    //删除训练  {"pid":"20"}
    @PostMapping("/delById")
    public Result<String> delById(@RequestBody DelPlanReq delPlanReq){
        if(delPlanReq == null){
            return Result.buildFailure("id不存在，删除失败");
        }
        planService.delById(delPlanReq);
        return Result.buildSuccess("删除成功");
    }
    //更改计划的完成信息
    @PostMapping("/updateById")
    public Result<String> updateById(@RequestBody UpdatePlanReq updatePlanReq){
        if(updatePlanReq == null){
            return Result.buildFailure("id不存在，修改失败");
        }
        planService.updateById(updatePlanReq);
        return Result.buildSuccess("修改成功");
    }
}

