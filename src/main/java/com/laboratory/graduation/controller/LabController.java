package com.laboratory.graduation.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.laboratory.graduation.model.Lab;

import com.laboratory.graduation.service.LabService;
import com.laboratory.graduation.util.PageUtil;
import com.laboratory.graduation.util.ResultUtil;
import com.laboratory.graduation.vo.base.PageResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * zgg
 * 2019/4/8 10:21
 */
@Controller
@RequestMapping("/lab")
public class LabController {
    @Autowired
    private LabService labService;


    @PostMapping("/list")
    @ResponseBody
    public PageResultVo loadLab(Lab lab, Integer limit, Integer offset){
        PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);


        List<Lab> labList = labService.selectLab(lab);
        PageInfo<Lab> pages = new PageInfo<>(labList);
        return ResultUtil.table(labList,pages.getTotal());
    }
}
