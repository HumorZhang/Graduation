package com.laboratory.graduation.service;

import com.laboratory.graduation.model.Equipment;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;


public interface EquipmentService {


    List<Equipment> selectEquipment(Equipment equipment);

    List<Equipment> selectEquipmentDamage(Equipment equipment);

    List<Equipment> selectAllEquipment();

    int updateByNumber(Equipment equipment);

    Equipment selectEquipmentById(String id);

    int updateStatusById(String id);

    int addEquipment(Equipment equipment);
//
//    boolean batchImport(String fileName, MultipartFile file) throws Exception;
}
