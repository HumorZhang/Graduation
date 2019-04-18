package com.laboratory.graduation.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laboratory.graduation.model.Equipment;
import com.laboratory.graduation.service.EquipmentService;
import com.laboratory.graduation.util.PageUtil;
import com.laboratory.graduation.util.ResultUtil;
import com.laboratory.graduation.vo.base.PageResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/equipmentDamage")
public class EquipmentDamageController {

    @Autowired
    private EquipmentService equipmentService;


    @PostMapping("/list")
    @ResponseBody
    public PageResultVo loadEquipment(Equipment equipment, Integer limit, Integer offset){
        PageHelper.startPage(PageUtil.getPageNo(limit, offset),limit);


        List<Equipment> equipmentList = equipmentService.selectEquipmentDamage(equipment);

        PageInfo<Equipment> pages = new PageInfo<>(equipmentList);
        return ResultUtil.table(equipmentList,pages.getTotal());
    }
}
