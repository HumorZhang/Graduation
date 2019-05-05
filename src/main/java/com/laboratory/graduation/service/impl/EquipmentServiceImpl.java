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
    public int addEquipment(Equipment equipment) {
        return 0;
    }


//    @Transactional(readOnly = false,rollbackFor = Exception.class)
//    @Override
//    public boolean batchImport(String fileName, MultipartFile file) throws Exception {
//        boolean notNull = false;
//        List<Equipment> userList = new ArrayList<>();
//        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
//            throw new MyException("上传文件格式不正确");
//        }
//        boolean isExcel2003 = true;
//        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
//            isExcel2003 = false;
//        }
//        InputStream is = file.getInputStream();
//        Workbook wb = null;
//        if (isExcel2003) {
//            wb = new HSSFWorkbook(is);
//        } else {
//            wb = new XSSFWorkbook(is);
//        }
//        Sheet sheet = wb.getSheetAt(0);
//        if(sheet!=null){
//            notNull = true;
//        }
//        Equipment equipment;
//        for (int r = 2; r <= sheet.getLastRowNum(); r++) {//r = 2 表示从第三行开始循环 如果你的第三行开始是数据
//            Row row = sheet.getRow(r);//通过sheet表单对象得到 行对象
//            if (row == null){
//                continue;
//            }
//            //sheet.getLastRowNum() 的值是 10，所以Excel表中的数据至少是10条；不然报错 NullPointerException
//            equipment = new Equipment();
//            if( row.getCell(0).getCellType() !=1){//循环时，得到每一行的单元格进行判断
//                throw new MyException("导入失败(第"+(r+1)+"行,用户名请设为文本格式)");
//            }
//            String username = row.getCell(0).getStringCellValue();//得到每一行第一个单元格的值
//            if(username == null || username.isEmpty()){//判断是否为空
//                throw new MyException("导入失败(第"+(r+1)+"行,用户名未填写)");
//            }
//            row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);//得到每一行的 第二个单元格的值
//            String password = row.getCell(1).getStringCellValue();
//            if(password==null || password.isEmpty()){
//                throw new MyException("导入失败(第"+(r+1)+"行,密码未填写)");
//            }
//            //完整的循环一次 就组成了一个对象
//            user.setUsername(username);
//            user.setPassword(password);
//            userList.add(user);
//        }
//        for (User userResord : userList) {
//            String name = userResord.getUsername();
//            int cnt = userMapper.selectByName(name);
//            if (cnt == 0) {
//                userMapper.addUser(userResord);
//                System.out.println(" 插入 "+userResord);
//            } else {
//                userMapper.updateUserByName(userResord);
//                System.out.println(" 更新 "+userResord);
//            }
//        }
//        return notNull;
//    }



}
