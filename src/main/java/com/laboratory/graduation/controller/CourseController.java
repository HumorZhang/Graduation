package com.laboratory.graduation.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laboratory.graduation.model.Course;
import com.laboratory.graduation.service.CourseService;
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
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("/list")
    @ResponseBody
    public PageResultVo loadDepartment(Course course, Integer limit, Integer offset, Model model){
        PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);

        List<Course> courseList = courseService.selectedAll();

        PageInfo<Course> pages = new PageInfo<>(courseList);
        return ResultUtil.table(courseList,pages.getTotal());

    }


    /**编辑详情*/
    @GetMapping("/edit")
    public String courseDetail(Model model, String courseId){


        model.addAttribute("courseId", courseId);
        return "course/courseDetail";
    }

    /**编辑*/
    @PostMapping("/edit")
    @ResponseBody
    public ResponseVo editcourse(Course courseForm){
        System.out.println(courseForm.toString());

        int a = courseService.updateByCourseId(courseForm);

        if (a > 0) {
            return ResultUtil.success("打分成功！");
        } else {
            return ResultUtil.error("打分失败");
        }
    }



}
