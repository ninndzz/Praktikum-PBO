
package com.hanindiyaputri.praktikumpbo.pertemuan3.challenge;


public class Challenge {

    String name;
    int visitorsToday;
    int yearBuilt;

    public Challenge() {

    }

    public Challenge(String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }

    public void showProfile() {
        System.out.println("Nama : " + name);
        System.out.println("Today Visitor : " + visitorsToday);
        System.out.println("Year Built : " + yearBuilt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}

