package com.laboratory.graduation.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.laboratory.graduation.model.Department;
import com.laboratory.graduation.model.Lab;

import com.laboratory.graduation.model.User;
import com.laboratory.graduation.service.DepartmentService;
import com.laboratory.graduation.service.LabService;
import com.laboratory.graduation.util.CoreConst;
import com.laboratory.graduation.util.PageUtil;
import com.laboratory.graduation.util.ResultUtil;
import com.laboratory.graduation.vo.base.PageResultVo;
import com.laboratory.graduation.vo.base.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/list")
    @ResponseBody
    public PageResultVo loadLab(Lab lab, Integer limit, Integer offset,Model model){
        PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);
        List<Lab> labList = labService.selectLab(lab);
        PageInfo<Lab> pages = new PageInfo<>(labList);
        return ResultUtil.table(labList,pages.getTotal());
    }

//    @GetMapping("/123")
//    @ResponseBody
//    public String haha(){
//        List<Department> list1 = departmentService.selectMajor();
//        System.out.println(list1.toString());
//        return null;
//    }
    /**编辑实验室详情*/
    @GetMapping("/edit")
    public String labDetail(Model model, String id){
        Lab lab = labService.selectLabById(id);

        model.addAttribute("lab", lab);
        return "lab/labDetail";
    }

    /**编辑实验室*/
    @PostMapping("/edit")
    @ResponseBody
    public ResponseVo editLab(Lab labForm){
        int a = labService.updateByLabId(labForm);

        if (a > 0) {
            return ResultUtil.success("编辑实验室成功！");
        } else {
            return ResultUtil.error("编辑实验室失败");
        }
    }


    @PostMapping("/add")
    @ResponseBody
    public ResponseVo addLab(Lab labForm){

//        List lab = labService.selectLab(labForm);
//        if (null != lab) {
//            return ResultUtil.error("实验室已存在");
//        }
        labForm.setStatus("1");


        int a = labService.addLab(labForm);
        if(a > 0){
            return ResultUtil.success("添加实验室成功");
        }else {
            return ResultUtil.error("添加实验室失败");
        }
    }



    /**删除实验室*/
    @GetMapping("/delete")
    @ResponseBody
    public ResponseVo deleteUser(String id) {

        int a = labService.updateStatusById(id);
        if (a > 0) {
            return ResultUtil.success("删除实验室成功");
        } else {
            return ResultUtil.error("删除实验室失败");
        }
    }
}
