package com.baidu.domain;

public class Epidemic {
    private String area;//地区
    private Integer newPeople;//新增
    private Integer existing;//现有
    private Integer accumulative;//累计
    private Integer cure;//治愈
    private Integer death;//死亡

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getNewPeople() {
        return newPeople;
    }

    public void setNewPeople(Integer newPeople) {
        this.newPeople = newPeople;
    }

    public Integer getExisting() {
        return existing;
    }

    public void setExisting(Integer existing) {
        this.existing = existing;
    }

    public Integer getAccumulative() {
        return accumulative;
    }

    public void setAccumulative(Integer accumulative) {
        this.accumulative = accumulative;
    }

    public Integer getCure() {
        return cure;
    }

    public void setCure(Integer cure) {
        this.cure = cure;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }
}
