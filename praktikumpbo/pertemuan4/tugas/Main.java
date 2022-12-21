
package com.hanindiyaputri.praktikumpbo.pertemuan4.tugas;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println(" === MENU BANGUN RUANG === ");
 System.out.println(" 1. KUBUS ");
 System.out.println(" 2. BALOK ");
 System.out.println(" 3. TABUNG ");
 System.out.println(" 4. Keluar ");
 System.out.print("Masukkan Pilihan : ");
 int pilihan = input.nextInt();
 System.out.println();
 
 // pembuatan object
 Kubus kb = new Kubus();
 BangunRuang br = new BangunRuang();
 Tabung ta = new Tabung();
 
 // mengisi nilai attribute
 kb.nama = "Kubus";
 kb.sisi = 6;
 kb.sudut = 8;
 kb.ciriCiri = "90 derajat";

 br.nama = "Balok";
 br.sisi =6;
 br.sudut = 8;
 
 ta.nama = "Tabung";
 ta.sisi = 3;
 ta.sudut = 0;
 ta.ciriCiri = "tutup dan tinggi";

 // pemanggilan method
 switch(pilihan){
 case 1:
 kb.hitungLuas();
 kb.showInfo();
 kb.sifat();
 kb.extraInfo();
 break;

 case 2:
 br.hitungLuas();
 br.showInfo();
 break;

 case 3:
 ta.hitungLuas();
 ta.showInfo();
 ta.sifat();
 ta.extraInfo();
 break;

 case 4:
 System.out.println("Silahkan Keluar");
 break;
 }
 }
}


