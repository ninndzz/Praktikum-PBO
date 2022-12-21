
package com.hanindiyaputri.praktikumpbo.pertemuan3.tugashanindiya;


public class Nindy {
    //Attribute
    private String name;
    private int tinggi;
    private double berat;
    private int umur;
   
    
    // Constructor
    public Nindy(){}
    
    public Nindy(String name, int tinggi, double berat, int umur) {
        this.name = name;
        this.tinggi = tinggi;
        this.berat = berat;
        this.umur = umur;
        
         }
    
    
    //Method mencetak semua attribute
    public void tentangSaya(){
        System.out.println("Nama : " + name);
        System.out.println("Umur Saya : " + umur + " Tahun");
        System.out.println("Tinggi Badan Saya: " + tinggi + " Cm");
        System.out.println("Berat Badan Saya :" + berat + " Kg");
        System.out.println();
    }
    
    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

