/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hanindiyaputri.praktikumpbo.praktikum2;

import java.util.Scanner;

/**
 *
 * @author 29han
 */
public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //code untuk input bilangan yang akan menjadi objek condition if else
        System.out.print("Masukkan bilangan bulat :");
        int bilangan = input.nextInt();
        
        //if (condition 1) Kode program yang dijalankan jika condition_1 berisi nilai True
        //jika bilangan lebih dari (>) 0 maka akan muncul output " adalah bilangan positif! "
        if(bilangan > 0)
            System.out.println(bilangan + " adalah bilangan positif! ");
        
       //else if (condition 2)Kode program yang dijalankan jika condition_2 berisi nilai True
        //jika bilangan kurang dari (<) 0 maka akan muncul output " adalah bilangan negatif!"
        else if(bilangan < 0)
            System.out.println(bilangan + " adalah bilangan negatif!");
        
        //else (condition 3) Kode program yang dijalankan jika semua kondisi tidak terpenuhi
        //jika bilangan yang di input 0 (tidak ada) maka akan muncul output " adalah nol!" 
        else
            System.out.println(bilangan + " adalah nol!");
    }
}
