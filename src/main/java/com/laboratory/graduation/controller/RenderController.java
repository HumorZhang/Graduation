package com.laboratory.graduation.controller;

import com.laboratory.graduation.model.Department;
import com.laboratory.graduation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class RenderController {

    @Autowired
    DepartmentService departmentService;
    /*工作台*/
    @GetMapping("/workdest")
    public String workdest(){
        return "index/workdest";
    }

    /**用户列表入口*/
    @GetMapping("/users")
    public String userList(){
        return "user/list";
    }

    /*角色列表入口*/
    @GetMapping("/roles")
    public String roleList() {
        return "role/list";
    }

    /*权限列表入口*/
    @GetMapping("/permissions")
    public String permissionList(){
        return "permission/list";
    }

    @GetMapping("/labs")
    public String labList(Model model){
        List<Department> listMajor = departmentService.selectMajor();
        model.addAttribute("listMajor", listMajor);

        return "lab/list";
    }

    @GetMapping("/equipments")
    public String equipments(){ return "equipment/list";}

    @GetMapping("/courses")
    public String courses(){ return "course/list";}

    @GetMapping("/departments")
    public String departments(){ return "department/list";}

    @GetMapping("/equipmentDamage")
    public String equipmentsDamage(){ return "equipment/damageList";}

    @GetMapping("/courseStudent/list")
    public String courseStudent(){ return "course/scoreList";}

    /*在线用户入口*/
    @GetMapping("/online/users")
    public String onlineUsers(){return "onlineUsers/list";}
}
