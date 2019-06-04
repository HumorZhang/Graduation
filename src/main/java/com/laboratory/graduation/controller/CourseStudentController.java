package com.laboratory.graduation.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laboratory.graduation.model.Course;
import com.laboratory.graduation.service.CourseService;
import com.laboratory.graduation.util.PageUtil;
import com.laboratory.graduation.util.ResultUtil;
import com.laboratory.graduation.vo.base.PageResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/courseStudent")
public class CourseStudentController {

        @Autowired
        CourseService courseService;

        @PostMapping("/list")
        @ResponseBody
        public PageResultVo loadscore(Course course, Integer limit, Integer offset){
            PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);


            List<Course> equipmentList = courseService.selectedAll();

            PageInfo<Course> pages = new PageInfo<>(equipmentList);
            return ResultUtil.table(equipmentList,pages.getTotal());
        }


}
