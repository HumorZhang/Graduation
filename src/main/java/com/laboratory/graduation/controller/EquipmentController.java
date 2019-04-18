package com.laboratory.graduation.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laboratory.graduation.model.Equipment;
import com.laboratory.graduation.model.User;
import com.laboratory.graduation.service.EquipmentService;
import com.laboratory.graduation.util.PageUtil;
import com.laboratory.graduation.util.ResultUtil;
import com.laboratory.graduation.vo.base.PageResultVo;
import com.laboratory.graduation.vo.base.ResponseVo;
import org.apache.poi.hssf.usermodel.*;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;



    @PostMapping("/list")
    @ResponseBody
    public PageResultVo loadEquipment(Equipment equipment, Integer limit, Integer offset, Model model){
        PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);

        List<Equipment> equipmentList = equipmentService.selectEquipment(equipment);

        PageInfo<Equipment> pages = new PageInfo<>(equipmentList);
        return ResultUtil.table(equipmentList,pages.getTotal());
    }


    @GetMapping(value = "/excel")
    public void downloadAllClassmate(HttpServletResponse response) throws IOException {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("信息表");

        List<Equipment> classmateList = equipmentService.selectAllEquipment();

        String fileName = "equipmentInfo"  + ".xls";//设置要导出的文件的名字
        //新增数据行，并且设置单元格数据

        int rowNum = 1;

        String[] headers = {"ID",
        "所属实验室"
        ,"设备编号"
        ,"设备名称"
        ,"型号"
        ,"规格"
        ,"厂家"
        ,"单价"
        ,"数量"
        ,"金额"
        ,"入库时间"
        ,"使用方向"
        ,"存放地点"
        ,"出厂号"
        ,"领用人"
        ,"毁坏程度"};
        //headers表示excel表中第一行的表头

        HSSFRow row = sheet.createRow(0);
        //在excel表中添加表头

        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (Equipment equipment : classmateList) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(equipment.getId());
            row1.createCell(1).setCellValue(equipment.getBelongLab());
            row1.createCell(2).setCellValue(equipment.getNumber());
            row1.createCell(3).setCellValue(equipment.getEquipname());

            row1.createCell(4).setCellValue(equipment.getVersion());
            row1.createCell(5).setCellValue(equipment.getSpec());
            row1.createCell(6).setCellValue(equipment.getManufactor());
            row1.createCell(7).setCellValue(equipment.getUnitprice());

            row1.createCell(8).setCellValue(equipment.getAmount());
            row1.createCell(9).setCellValue(equipment.getSumOfMoney());
            row1.createCell(10).setCellValue(equipment.getWarehousingTime());
            System.out.println(equipment.getWarehousingTime());
            row1.createCell(11).setCellValue(equipment.getUsingDirection());

            row1.createCell(12).setCellValue(equipment.getStoLocation());
            row1.createCell(13).setCellValue(equipment.getFactoryNumber());
            row1.createCell(14).setCellValue(equipment.getLeader());
            row1.createCell(15).setCellValue(equipment.getDamage());
            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());


    }


    /**编辑实验室详情*/
    @GetMapping("/edit")
    public String equipmentDetail(Model model, String id){
        Equipment equipment = equipmentService.selectEquipmentById(id);

        model.addAttribute("equipment", equipment);
        return "equipment/equipmentDetail";
    }


    @PostMapping("/edit")
    @ResponseBody
    public ResponseVo editLab(Equipment equipmentForm){
        int a = equipmentService.updateByNumber(equipmentForm);
        System.out.println("id="+equipmentForm.getId());
        System.out.println("damage="+equipmentForm.getDamage());

        if (a > 0) {
            return ResultUtil.success("编辑设备成功！");
        } else {
            return ResultUtil.error("编辑设备失败");
        }
    }



    /**删除实验室*/
    @GetMapping("/delete")
    @ResponseBody
    public ResponseVo deleteUser(String id) {

        int a = equipmentService.updateStatusById(id);
        if (a > 0) {
            return ResultUtil.success("删除设备成功");
        } else {
            return ResultUtil.error("删除设备失败");
        }
    }



}
