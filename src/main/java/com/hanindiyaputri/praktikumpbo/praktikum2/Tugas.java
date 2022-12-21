/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hanindiyaputri.praktikumpbo.praktikum2;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int i;
       int log = 0;
       i = 1;
       String username, password;
       do{
           System.out.println("**************");
           System.out.println("|----Login---|");
           System.out.println("**************");
           System.out.print("\n Username : ");
           username = input.nextLine();
           System.out.print("\n Password : ");
           password = input.nextLine();
           
           if(username.equals("HanindiyaPutri")&&password.equals("ninnnzz")){
               System.out.println("\n Login Berhasil \n");
               i = 4;
               log = 1;
           }else{
               System.out.println("\nLogin Gagal\n");
               i = i + 1;
           }
           
       }while(i <= 3);
            if(log != 1){
                System.out.println("3x Percobaan Login Telah Gagal");
                System.out.println("Keluar dari Program");
           }
       }
    }
  

