package com.laboratory.graduation.mapper;

import com.laboratory.graduation.model.Lab;
import com.laboratory.graduation.util.MyMapper;

import java.util.List;

/**
 * zgg
 * 2019/4/9 9:30
 */
public interface LabMapper extends MyMapper<Lab> {
    List<Lab> selectLabs(Lab lab);
}
