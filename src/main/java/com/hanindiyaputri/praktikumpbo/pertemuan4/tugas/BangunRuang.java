
package com.hanindiyaputri.praktikumpbo.pertemuan4.tugas;


public class BangunRuang {
    // Attribute
 String nama;
 int sisi;
 int sudut;

 // method untuk bangun ruang
 public void hitungLuas(){
 System.out.println("Luas untuk  " + nama +" adalah dengan menghitung perkalian antara sisi sisi nya");
 }

 public void showInfo(){
 System.out.println("Bangun Ruang " + nama + " Memiliki sisi sebanyak : " +
sisi + " dan jumlah titik sudut sebanyak : " + sudut);
 extraInfo();
 }

 // penambahan method
 public void extraInfo(){}
}

