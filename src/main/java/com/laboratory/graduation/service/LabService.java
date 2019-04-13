package com.laboratory.graduation.service;

import com.laboratory.graduation.model.Lab;

import java.util.List;

/**
 * zgg
 * 2019/4/8 11:51
 */
public interface LabService  {
    List<Lab> selectLab(Lab lab);

    int updateByLabId(Lab lab);

    Lab selectLabById(String id);

    int updateStatusById(String id);

    int addLab(Lab lab);


}
