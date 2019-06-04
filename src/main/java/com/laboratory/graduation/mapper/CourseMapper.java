package com.laboratory.graduation.mapper;

import com.laboratory.graduation.model.Course;
import com.laboratory.graduation.util.MyMapper;

import java.util.List;

public interface CourseMapper  extends MyMapper<Course> {
    List<Course> selectAll();
    int updateByCourseId(Course course);
}
