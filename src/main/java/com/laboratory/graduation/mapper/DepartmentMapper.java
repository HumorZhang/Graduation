package com.laboratory.graduation.mapper;

import com.laboratory.graduation.model.Department;
import com.laboratory.graduation.util.MyMapper;

import java.util.List;

public interface DepartmentMapper extends MyMapper<Department> {
    List<Department> selectDepartments(Department department);

    Department selectDepartmentByTeam(Department department);

    int updateStatusById(String id);

    List<Department> selectMajor();

}
