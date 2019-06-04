package com.laboratory.graduation.service;

import com.laboratory.graduation.model.Course;

import java.util.List;

public interface CourseService {
    List<Course>  selectedAll();
    int updateByCourseId(Course course);
}
