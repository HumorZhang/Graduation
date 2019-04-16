package com.laboratory.graduation.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Equipment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String belongLab;

    private String number;

    private String equipname;

    private String version;

    private String spec;

    private String manufactor;

    private float unitprice;

    private Integer amount;

    private float sumOfMoney;

    private Date warehousingTime;

    private  String usingDirection;

    private String stoLocation;

    private String factoryNumber;

    private String leader;

    private Integer status;

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

    public float getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(float sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    public Date getWarehousingTime() {
        return warehousingTime;
    }

    public void setWarehousingTime(Date warehousingTime) {
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
