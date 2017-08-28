package com.alex.myapplication.Model;

/**
 * Created by aasantos4 on 28/08/2017.
 */

public class College {
    private int logo;
    private String college, patron, building;

    public College(int logo, String college, String patron, String building) {
        this.logo = logo;
        this.college = college;
        this.patron = patron;
        this.building = building;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
