package com.qing.qingboot.ex;

import com.qing.qingboot.enums.CodeEnum;
import lombok.Data;

@Data
public class BizEx extends RuntimeException  {
    private Integer code;
    public BizEx(String msg){
        super(msg);
    }
    public BizEx (CodeEnum codeEnum){
        super(codeEnum.getMsg());
        this.code = codeEnum.getCode();
    }
}
