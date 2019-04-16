package com.laboratory.graduation.mapper;

import com.laboratory.graduation.model.Equipment;

import com.laboratory.graduation.util.MyMapper;

import java.util.List;

public interface EquipmentMapper extends MyMapper<Equipment> {
    List<Equipment> selectEquipments(Equipment equipment);

    int updateByNumber(Equipment equipment);

    Equipment selectEquipmentByNumber(String id);

    int updateStatusByNumber(String id);

    List<Equipment> selectAllEquipments();
}
