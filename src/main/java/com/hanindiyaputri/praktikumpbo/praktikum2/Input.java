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
public class Input {
    public static void main(String[] args) {
        //Scanner digunakan untuk membuat objek referensi sebagai media penginputan data.
        Scanner input = new Scanner(System.in);
        
        //code untuk memasukkan input nama menggunakan tipe data string 
        //karena berbentuk barisan karakter seperti kata dan kalimat
        System.out.print("Masukkan nama :");
        String nama = input.nextLine();
        
        
        //code untuk memasukkan input usia menggunakan tipe data int
        //karena tipe data int akan menyimpan karakter angka
        System.out.print("Masukkan usia :");
        int usia = input.nextInt();
        
        
        //printIn  berfungsi untuk mencetak data, setelah data 
        //data tersebut dicetak diikuti dengan perpindahan baris baru.
        System.out.println("Nama saya : " + nama);
        System.out.println("Usia saya : " + usia + "tahun");
    }
    
}
