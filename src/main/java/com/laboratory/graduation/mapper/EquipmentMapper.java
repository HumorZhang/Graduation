package com.laboratory.graduation.mapper;

import com.laboratory.graduation.model.Equipment;

import com.laboratory.graduation.util.MyMapper;

import java.util.List;

public interface EquipmentMapper extends MyMapper<Equipment> {
    List<Equipment> selectEquipments(Equipment equipment);

    List<Equipment> selectEquipmentsDamage(Equipment equipment);

    int updateByNumber(Equipment equipment);

    Equipment selectEquipmentById(String id);

    int updateStatusByNumber(String id);

    List<Equipment> selectAllEquipments();

    int selectMaxId();

    int insertOne(Equipment equipment);
}
