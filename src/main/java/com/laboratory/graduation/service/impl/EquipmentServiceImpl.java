package com.laboratory.graduation.service.impl;

import com.laboratory.graduation.mapper.EquipmentMapper;
import com.laboratory.graduation.model.Equipment;
import com.laboratory.graduation.model.Lab;
import com.laboratory.graduation.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EquipmentServiceImpl  implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public List<Equipment> selectEquipment(Equipment equipment) {
        return equipmentMapper.selectEquipments(equipment);
    }

    @Override
    public List<Equipment> selectEquipmentDamage(Equipment equipment) {
        return equipmentMapper.selectEquipmentsDamage(equipment);
    }

    @Override
    public List<Equipment> selectAllEquipment() {
        return equipmentMapper.selectAllEquipments();
    }

    @Override
    public int updateByNumber(Equipment equipment) {
        return equipmentMapper.updateByNumber(equipment);
    }

    @Override
    public Equipment selectEquipmentById(String id) {
        return equipmentMapper.selectEquipmentById(id);
    }

    @Override
    public int updateStatusById(String id) {
        return equipmentMapper.updateStatusByNumber(id);
    }

    @Override
    public int addEquipment(Equipment equipment) {
        return 0;
    }
}
