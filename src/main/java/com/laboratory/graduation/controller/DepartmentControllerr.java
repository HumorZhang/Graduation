package com.laboratory.graduation.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.laboratory.graduation.model.Department;
import com.laboratory.graduation.service.DepartmentService;
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

@Controller
@RequestMapping("/department")
public class DepartmentControllerr {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/list")
    @ResponseBody
    public PageResultVo loadDepartment(Department department, Integer limit, Integer offset, Model model){
        PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);

        List<Department> departmentList = departmentService.selectDepartments(department);

        PageInfo<Department> pages = new PageInfo<>(departmentList);
        return ResultUtil.table(departmentList,pages.getTotal());

    }

    @GetMapping("/delete")
    @ResponseBody
    public ResponseVo deleteUser(String id) {

        int a = departmentService.updateStatusById(id);
        if (a > 0) {
            return ResultUtil.success("删除专业成功");
        } else {
            return ResultUtil.error("删除专业失败");
        }
    }

    @PostMapping("/add")
    @ResponseBody
    public ResponseVo addLab(Department departmentForm){


       Department department = departmentService.selectDepartmentBymajor(departmentForm);
        System.out.println(departmentForm.toString());
        if (null != department) {
            return ResultUtil.error("专业已存在");
        }
        departmentForm.setStatus(1);


        int a = departmentService.add(departmentForm);
        if(a > 0){
            return ResultUtil.success("添加专业成功");
        }else {
            return ResultUtil.error("添加专业失败");
        }
    }

}
