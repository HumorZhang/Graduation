package com.laboratory.graduation.service;

import com.laboratory.graduation.model.Department;


import java.util.List;

public interface DepartmentService {
    List<Department> selectDepartments(Department department);

    int add(Department department);

    Department selectDepartmentBymajor(Department department);

    int updateStatusById(String id);
}
