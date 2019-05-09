package com.laboratory.graduation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RenderController {

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
    public String labList(){
        return "lab/list";
    }

    @GetMapping("/equipments")
    public String equipments(){ return "equipment/list";}

    @GetMapping("/equipmentDamage")
    public String equipmentsDamage(){ return "equipment/damageList";}

    /*在线用户入口*/
    @GetMapping("/online/users")
    public String onlineUsers(){return "onlineUsers/list";}
}
