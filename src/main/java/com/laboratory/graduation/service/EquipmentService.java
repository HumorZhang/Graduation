package com.laboratory.graduation.service;

import com.laboratory.graduation.model.Equipment;
import com.laboratory.graduation.model.Lab;

import java.util.List;


public interface EquipmentService {


    List<Equipment> selectEquipment(Equipment equipment);

    List<Equipment> selectAllEquipment();

    int updateByNumber(Equipment equipment);

    Lab selectEquipmentByNumber(String number);

    int updateStatusById(String id);

    int addEquipment(Equipment equipment);
}
