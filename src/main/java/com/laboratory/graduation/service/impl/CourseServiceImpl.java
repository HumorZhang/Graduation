package com.laboratory.graduation.service.impl;

import com.laboratory.graduation.mapper.CourseMapper;
import com.laboratory.graduation.model.Course;
import com.laboratory.graduation.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;


    @Override
    public List<Course> selectedAll() {
        return courseMapper.selectAll();
    }

    @Override
    public int updateByCourseId(Course course) {
        return courseMapper.updateByCourseId(course);
    }
}
