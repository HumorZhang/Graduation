package com.laboratory.graduation.service.impl;

import com.laboratory.graduation.mapper.DepartmentMapper;
import com.laboratory.graduation.model.Department;
import com.laboratory.graduation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectDepartments(Department department) {
        return departmentMapper.selectDepartments(department);
    }

    @Override
    public int add(Department department) {
        return departmentMapper.insert(department);
    }

    @Override
    public Department selectDepartmentBymajor(Department department) {
        return departmentMapper.selectDepartmentByMajor(department);
    }

    @Override
    public int updateStatusById(String id) {
        return departmentMapper.updateStatusById(id);
    }
}
