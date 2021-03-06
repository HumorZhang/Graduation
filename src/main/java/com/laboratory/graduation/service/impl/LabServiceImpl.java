package com.laboratory.graduation.service.impl;

import com.laboratory.graduation.mapper.LabMapper;
import com.laboratory.graduation.model.Lab;
import com.laboratory.graduation.service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * zgg
 * 2019/4/8 11:52
 */
@Service
public class LabServiceImpl implements LabService {
    @Autowired
    private LabMapper labMapper;

    @Override
    public List<Lab> selectLab(Lab lab) {
        return labMapper.selectLabs(lab);
    }

    @Override
    public int updateByLabId(Lab lab) {
        return labMapper.updateByLabId(lab);
    }

    @Override
    public Lab selectLabById(String id) {
        return labMapper.selectLabById(id);
    }

    @Override
    public int updateStatusById(String id) {
        return labMapper.updateStatusById(id);

    }

    @Override
    public int addLab(Lab lab) {
        return labMapper.insert(lab);
    }


}
