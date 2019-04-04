package com.laboratory.graduation.util;
/**
 * @version V1.0
 * @date 2018年7月11日
 * @author superzheng
 */
public class PageUtil {
    public static Integer getPageNo(Integer limit,Integer offset){
        return offset==0 ? 1 : offset / limit + 1;//如果offset==0，offset赋值为1，否则赋值offset/limit + 1
    }
}
