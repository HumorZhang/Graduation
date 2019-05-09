package com.laboratory.graduation.util;

public class PageUtil {
    public static Integer getPageNo(Integer limit,Integer offset){
        return offset==0 ? 1 : offset / limit + 1;//如果offset==0，offset赋值为1，否则赋值offset/limit + 1
    }
}
