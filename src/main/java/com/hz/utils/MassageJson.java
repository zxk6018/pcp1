package com.hz.utils;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MassageJson<T> {
    private Integer code; // 错误代码  0代码成功
    private String msg;
    private Integer count;//总条数
    private T data; //数据

    public MassageJson(Integer code){
        this.code = code;
        this.msg = this.code>0?"操作成功":"操作失败";
    }
    public MassageJson(Integer code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
