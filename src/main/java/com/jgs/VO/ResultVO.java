package com.imooc.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回给前端的数据封装
 * Created by Administrator on 2017/10/13 0013.
 */
@Data
public class ResultVO<T> implements Serializable{
    private static final long serialVersionUID = -4414926978700453869L;
    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
