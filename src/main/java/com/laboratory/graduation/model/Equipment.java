package com.laboratory.graduation.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;



@Entity
@Table(name = "equipment")
public class Equipment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name = "id" ,orderNum = "0")
    private Integer id;

    @Column(name = "belong_lab")
    @Excel(name = "所属实验室" ,orderNum = "1")
    private String belongLab;

    @Column(name = "number")
    @Excel(name = "设备编号" ,orderNum = "2")
    private String number;

    @Column(name = "equipname")
    @Excel(name = "设备名称" ,orderNum = "3")
    private String equipname;

    @Column(name = "version")
    @Excel(name = "型号" ,orderNum = "4")
    private String version;

    @Column(name = "spec")
    @Excel(name = "规格" ,orderNum = "5")
    private String spec;

    @Column(name = "manufactor")
    @Excel(name = "厂家" ,orderNum = "6")
    private String manufactor;

    @Column(name = "unitprice")
    @Excel(name = "单价" ,orderNum = "7")
    private float unitprice;

    @Column(name = "amount")
    @Excel(name = "数量" ,orderNum = "8")
    private Integer amount;

    @Column(name = "sum_of_money")
    @Excel(name = "金额" ,orderNum = "9")
    private float sumOfMoney;

    public float getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(float sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    @Column(name = "warehousing_time")
    @Excel(name = "入库时间" ,orderNum = "10",importFormat = "yyyy-MM-dd HH:mm:ss")
    private Timestamp warehousingTime;

    @Column(name = "using_direction")
    @Excel(name = "使用方向" ,orderNum = "11")
    private  String usingDirection;

    @Column(name = "sto_location")
    @Excel(name = "存放地点" ,orderNum = "12")
    private String stoLocation;

    @Column(name = "factory_number")
    @Excel(name = "金额" ,orderNum = "13")
    private String factoryNumber;

    @Column(name = "leader")
    @Excel(name = "领用人" ,orderNum = "14")
    private String leader;


    private Integer status;

    @Column(name = "damage")
    @Excel(name = "毁坏程度" ,orderNum = "15")
    private Integer damage;

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", belongLab='" + belongLab + '\'' +
                ", number='" + number + '\'' +
                ", equipname='" + equipname + '\'' +
                ", version='" + version + '\'' +
                ", spec='" + spec + '\'' +
                ", manufactor='" + manufactor + '\'' +
                ", unitprice=" + unitprice +
                ", amount=" + amount +
                ", sumOfMoney=" + sumOfMoney +
                ", warehousingTime=" + warehousingTime +
                ", usingDirection='" + usingDirection + '\'' +
                ", stoLocation='" + stoLocation + '\'' +
                ", factoryNumber='" + factoryNumber + '\'' +
                ", leader='" + leader + '\'' +
                ", status=" + status +
                ", damage=" + damage +
                '}';
    }

    public String getEquipname() {
        return equipname;
    }

    public void setEquipname(String equipname) {
        this.equipname = equipname;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBelongLab() {
        return belongLab;
    }

    public void setBelongLab(String belongLab) {
        this.belongLab = belongLab;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public float getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(float unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }



    public Timestamp getWarehousingTime() {
        return warehousingTime;
    }

    public void setWarehousingTime(Timestamp warehousingTime) {
        this.warehousingTime = warehousingTime;
    }

    public String getUsingDirection() {
        return usingDirection;
    }

    public void setUsingDirection(String usingDirection) {
        this.usingDirection = usingDirection;
    }

    public String getStoLocation() {
        return stoLocation;
    }

    public void setStoLocation(String stoLocation) {
        this.stoLocation = stoLocation;
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
}
