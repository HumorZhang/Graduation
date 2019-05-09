package com.laboratory.graduation.service.impl;

import com.laboratory.graduation.mapper.EquipmentMapper;
import com.laboratory.graduation.model.Equipment;
import com.laboratory.graduation.model.Lab;
import com.laboratory.graduation.service.EquipmentService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
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
    public int insertOne(Equipment equipment) {
        int a = equipmentMapper.insertOne(equipment);
        return a;
    }

    @Override
    public int selectMaxId() {
        return equipmentMapper.selectMaxId();
    }


}
