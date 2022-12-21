/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hanindiyaputri.praktikumpbo.praktikum2;

/**
 *
 * @author 29han
 */
public class Loop {
    public static void main(String[] args) {
        
        //perulangan for digunakan untuk melakukan perintah perulangan yang telah diketahui jumlah banyaknya
        //code dibawah menggunakan tipe data int sebagai variabelnya
        //(i++) untuk perulangan yang bersifat increment (menaik)
        //jika code dibawah dijalankan akan melakukan perulangan dari 0 ke kurang dari 5 
        for (int i = 0; i < 5; i++) {
            System.out.println("Looping... (" + i + "/5");

        }
        System.out.println("For loop selesai! \n");
        
        //perulangan menggunakan while akan melakukan pengecekan kondisi di awal
        //perulangan akan dilakukan jika kondisi bernilai benar
        //jika code dibawah dijalankan akan melakukan perulangan dari 0 ke kurang dari 5 
        int j=0;
        while(j<5){
            System.out.println("Looping... (" + j + "/5)");
            j++;
        }
        System.out.println("While loop selesai! \n");
        
        //perulangan do-while akan melakukan pengecekan kondisi di akhir
        //perulangan akan dilakukan jika kondisi bernilai benar
        //jika kondisi benar tidak terpenuhi, maka proses perulangan ini minimal akan dilakukan 1x
        int k=0;
        do {
            System.out.println("Looping... (" + k + "/5)");
            k++;
        } while(k<5);
        System.out.println("Do-While loop selesai! \n");
        }
    }

